package com.zlbc.CyUpErp.service.impl;

import com.google.gson.Gson;
import com.zlbc.CyUpErp.mapper.PrescriptionMapper;
import com.zlbc.CyUpErp.service.PrescriptionService;
import com.zlbc.CyUpErp.utils.FlowNoCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class PrescriptionServiceImpl implements PrescriptionService {
    @Resource
    private FlowNoCache flowNoCache;
    @Resource
    private PrescriptionMapper prescriptionMapper;

    @Override
    public Map<String, String> handleConsumptionResult(String result, String flowNo) {
        Map<String, String> response = new HashMap<>();
        log.info("╔══════════════════ 回调处理开始 ══════════════════");
        log.info("▷ 接收参数 | flowNo={}, result={}", flowNo, result);
        flowNoCache.remove(flowNo);
        flowNoCache.remove(flowNo);
        // 1. 检查 flowNo 是否为空
        if (flowNo == null || flowNo.trim().isEmpty()) {
            log.warn("◈ 参数校验失败 | error='缺少flowNo', action='终止处理'");
            response.put("flowNo", "");
            response.put("code", "1");
            response.put("msg", "缺少查询流水号");
            log.info("╚══════════════════ 处理结束 [状态:失败] ══════════════════");
            return response;
        }

        // 3. 业务处理
        try {
            if ("1".equals(result)) {
                prescriptionMapper.updateUpErpStatusConfirm(flowNo);
                log.info("◈ 状态更新成功 | flowNo={}, oldStatus=1, newStatus=2", flowNo);

                response.put("flowNo", flowNo);
                response.put("code", "0");
                response.put("msg", "请求成功");

                log.debug("◈ 响应数据 | {}", new Gson().toJson(response));
            } else {
                prescriptionMapper.updateUpErpStatus(flowNo, 0);
                log.warn("◈ 状态更新失败 | flowNo={}, reason='result不为1', action='状态回滚为0'", flowNo);

                response.put("flowNo", "");
                response.put("code", "1");
                response.put("msg", "处理失败: result 不为 1");
            }

            log.info("╚══════════════════ 处理结束 [状态:成功] ══════════════════");
            return response;
        } catch (Exception e) {
            log.error("◈ 处理异常 | flowNo={}, error={}", flowNo, e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public int updateInvalidIn48Hours(String startTime, String endTime) {
        return prescriptionMapper.updateInvalidIn48Hours(startTime,endTime);
    }
}
