package com.zlbc.CyUpErp.service;

import com.zlbc.CyUpErp.mapper.PrescriptionMapper;
import com.zlbc.CyUpErp.utils.FlowNoCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class FlowNoTimeoutChecker {
    private static final long THIRTY_MINUTES = 30 * 60 * 1000;
    @Resource
    private FlowNoCache flowNoCache;
    @Resource
    private PrescriptionMapper prescriptionMapper;

    @Scheduled(fixedRate = 60000) // 每1分钟检查一次
    public void checkTimeoutFlowNo() {
        long now = System.currentTimeMillis();
        flowNoCache.getAll().forEach((flowNo, time) -> {
            if (now - time > THIRTY_MINUTES) {
                // 超过30分钟未收到响应
                prescriptionMapper.updateUpErpStatus(flowNo, 0);
                log.info("◈ 发现超时处方 | flowNo={},处方状态更新为0", flowNo);
                flowNoCache.remove(flowNo);
                log.info("◈ flowNo={} 已修改未响应流水号的处方状态，从缓存中移除", flowNo);
            }
        });
    }
}
