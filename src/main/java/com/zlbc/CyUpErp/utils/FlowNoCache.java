package com.zlbc.CyUpErp.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Component;

@Component
public class FlowNoCache {

    // key = flowNo, value = 发送时间毫秒数
    private final ConcurrentMap<String, Long> flowNoMap = new ConcurrentHashMap<>();

    public void put(String flowNo) {
        flowNoMap.put(flowNo, System.currentTimeMillis());
    }

    public void remove(String flowNo) {
        flowNoMap.remove(flowNo);
    }

    public ConcurrentMap<String, Long> getAll() {
        return flowNoMap;
    }
}
