package com.example.listentopic.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "kafka.enable", havingValue = "true", matchIfMissing = true)
@Slf4j
public class TrafficConsumerService {
//    private Traffic
    @KafkaListener(topics = {"traffic.measurement.1min"})
    public void listenerTraffic(String message){
        log.info("Message of Kafka : {}", message);
    }
}
