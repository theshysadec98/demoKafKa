package com.example.listentopic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class AppConfig {
    @Bean
    public AppBean appBean(){
        AppBean appBean = new AppBean();
        return appBean;
    }
}
