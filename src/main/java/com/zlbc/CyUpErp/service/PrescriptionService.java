package com.zlbc.CyUpErp.service;

import java.time.LocalDateTime;
import java.util.Map;

public interface PrescriptionService {
    Map<String, String> handleConsumptionResult(String result, String flowNo);

    int updateInvalidIn168Hours(String startTime, String endTime);
}
