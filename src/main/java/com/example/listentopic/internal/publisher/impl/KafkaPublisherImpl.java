package com.example.listentopic.internal.publisher.impl;

import com.example.listentopic.internal.publisher.KafkaPublisher;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class KafkaPublisherImpl implements KafkaPublisher {

    private static Logger logger =LoggerFactory.getLogger(KafkaPublisherImpl.class);

    private KafkaTemplate kafkaTemplate;

    public KafkaPublisherImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Async
    @Override
    public void send(String topic, Object payload) {
        if( StringUtils.isEmpty(topic) ) return;

        Gson gson = new Gson();
        String message = gson.toJson(payload);
        logger.info("Send message: " + message + " topic: " + topic);
        kafkaTemplate.send(topic, message);
    }

}
