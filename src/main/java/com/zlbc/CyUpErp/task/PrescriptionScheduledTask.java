package com.zlbc.CyUpErp.task;

import com.zlbc.CyUpErp.service.PrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class PrescriptionScheduledTask {
    @Resource
    private PrescriptionService prescriptionService;

    @Scheduled(cron = "0 0 1 * * ?")
    public void processInvalidPrescriptions() {
        log.info("开始处理48小时内的作废处方");
        LocalDateTime endTime = LocalDateTime.now();
        LocalDateTime startTime = endTime.minusHours(48);
        log.info("时间范围：{} 至 {}", startTime, endTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startTimeStr = startTime.format(formatter);
        String endTimeStr = endTime.format(formatter);
        int updatedCount = prescriptionService.updateInvalidIn48Hours(startTimeStr, endTimeStr);
        log.info("处理完成，共更新{}条作废处方", updatedCount);
    }
}
