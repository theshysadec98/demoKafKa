package com.example.listentopic.service.impl;

import com.example.listentopic.model.entity.Traffic;
import com.example.listentopic.repository.TrafficRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "kafka.enable", havingValue = "true", matchIfMissing = true)
@Slf4j
public class TrafficConsumerService {
    @Autowired
    private TrafficRepository trafficRepository;
    private ObjectMapper objectMapper;
    @KafkaListener(topics = {"traffic.measurement.1min"})
    public void listenerTraffic(String message){
//        log.info("Message of Kafka : {}", message);
        Gson g = new Gson();
        Traffic traffic = g.fromJson(message, Traffic.class);
        trafficRepository.save(traffic);
        log.info("{}", traffic);
    }
}
