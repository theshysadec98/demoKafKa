package com.example.listentopic.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppBean {
    public static Map<String, String> configMap = new ConcurrentHashMap<>();
    public AppBean(){
        configMap.put("a.1", "1");
        configMap.put("a.2", "2");
    }
}
