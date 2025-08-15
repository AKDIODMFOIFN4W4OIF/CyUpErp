package com.zlbc.CyUpErp.service.impl;

import com.google.gson.Gson;
import com.zlbc.CyUpErp.entity.PrescriptionDetailDTO;
import com.zlbc.CyUpErp.mapper.PrescriptionMapper;
import com.zlbc.CyUpErp.service.MdmNoService;
import com.zlbc.CyUpErp.service.PrescriptionPushService;
import com.zlbc.CyUpErp.utils.FlowNoCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PrescriptionPushServiceImpl implements PrescriptionPushService {
    @Resource
    private MdmNoService mdmNoService;
    @Resource
    private FlowNoCache flowNoCache;

    @Resource
    private PrescriptionMapper prescriptionMapper;

    @Override
    public Map<String, Object> getPendingPrescriptions(String clientCode) {
        log.info("▶▶▶ 开始查询待推送处方 | clientCode={}", clientCode);

        // 1. 查询前 10 条未推送的处方 pspCode
        List<String> pspCodeList = prescriptionMapper.selectTop10PendingPrescriptionPspCodes(clientCode);
        if (pspCodeList == null || pspCodeList.isEmpty()) {
            log.debug("▷ 待处理处方列表 | count={}, sample={}", pspCodeList.size(),
                    pspCodeList.stream().limit(3).collect(Collectors.toList()));
//            return new LinkedHashMap<>();
            return null;
        }
        log.info("▷ 本次待推送处方数量: {}--{}条", clientCode, pspCodeList.size());

        // 2. 检查是否已有统一 flowNo
        String flowNo = prescriptionMapper.selectFlowNoByPspCodes(pspCodeList);
        if (flowNo == null || flowNo.trim().isEmpty()) {
            flowNo = mdmNoService.getCode("CYF", 7);
            log.info("▷ 生成新FlowNo | clientCode={}, flowNo={}, action='首次生成'", clientCode, flowNo);
        } else {
            log.info("▷ 使用现有FlowNo | clientCode={}, flowNo={}, action='复用已有'", clientCode, flowNo);
        }

        // 3. 批量更新 flowNo
        int updateCount = prescriptionMapper.batchUpdateFlowNo(flowNo, pspCodeList);
        log.info("▷ 批量更新FlowNo | clientCode={}, flowNo={}, updateCount={}/{}",
                clientCode, flowNo, updateCount, pspCodeList.size());

        // 4. 根据 flowNo 查询处方明细
        List<PrescriptionDetailDTO> detailList = prescriptionMapper.selectPrescriptionDetailByFlowNo(flowNo);
        if (detailList == null || detailList.isEmpty()) {
            log.warn("◈ 无处方明细数据 | clientCode={}, flowNo={}, action='终止处理'", clientCode, flowNo);
            return new LinkedHashMap<>();
        }
        log.info("▷ 处方明细数据 | clientCode={}, flowNo={}, detailCount={}",
                clientCode, flowNo, detailList.size());


        // 5. 更新状态为已推送
        prescriptionMapper.updateUpErpStatus(flowNo, 1);
        // 保存 flowNo 发送时间到缓存
        flowNoCache.put(flowNo);
        log.info("◈ 状态更新完成 | clientCode={}, flowNo={}, status=1, cache='已加载', ttl=30min",
                clientCode, flowNo);

        // 6. 返回结果
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("flowNo", flowNo);
        response.put("data", detailList);
        response.put("msg", "success");
        return response;
    }
}
