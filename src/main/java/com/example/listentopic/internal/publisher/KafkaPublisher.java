package com.example.listentopic.internal.publisher;

public interface KafkaPublisher {
    void send(String topic, Object payload);
}

