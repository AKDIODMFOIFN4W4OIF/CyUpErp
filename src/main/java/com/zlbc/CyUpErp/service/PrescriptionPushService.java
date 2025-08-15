package com.zlbc.CyUpErp.service;

import org.springframework.stereotype.Service;
import java.util.Map;



@Service
public interface PrescriptionPushService {
    /**
     * 查询待推送处方数据
     * @param clientCode 医院编码
     * @return 每条记录包含 flowNo 和 data 明细，空Map表示无数据
     */
    Map<String, Object> getPendingPrescriptions(String clientCode);
}
