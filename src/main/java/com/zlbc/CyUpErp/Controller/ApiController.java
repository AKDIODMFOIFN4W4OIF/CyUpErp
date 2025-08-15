package com.zlbc.CyUpErp.Controller;


import com.zlbc.CyUpErp.service.PrescriptionPushService;
import com.zlbc.CyUpErp.service.PrescriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping({"/api"})
public class ApiController {
    @Resource
    private PrescriptionPushService pushService;
    @Resource
    private PrescriptionService prescriptionService;

    /*英克调用该接口获取处方明细*/
    @PostMapping("/mdc/mbs/cy/consumption/dataGet")
    public ResponseEntity<Map<String, Object>> getPendingPrescriptions() {
        String clientCode = "949401";
//        return pushService.getPendingPrescriptions(clientCode);
        Map<String, Object> result = pushService.getPendingPrescriptions(clientCode);

        if (result == null) {
            Map<String, Object> noData = new LinkedHashMap<>();
            noData.put("flowNo", "");
            noData.put("data", Collections.emptyList());
            noData.put("msg", "false");
            return ResponseEntity.ok(noData);
        }
        return ResponseEntity.ok(result);
    }


    @PostMapping("/mdc/mbs/cy/consumption/resultPost")
    public ResponseEntity<Map<String, String>> handleConsumptionResult(
            @RequestBody Map<String, String> requestBody
    ) {
        String result = requestBody.get("result");
        String flowNo = requestBody.get("flowNo");

        Map<String, String> response = prescriptionService.handleConsumptionResult(result, flowNo);

        // 判断返回的 code 是否为 "0"，决定返回状态码
        if ("0".equals(response.get("code"))) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().body(response);
        }
    }
}
