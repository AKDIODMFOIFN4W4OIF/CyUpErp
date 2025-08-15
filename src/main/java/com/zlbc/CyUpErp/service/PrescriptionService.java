package com.zlbc.CyUpErp.service;

import java.util.Map;

public interface PrescriptionService {
    Map<String, String> handleConsumptionResult(String result, String flowNo);
}
