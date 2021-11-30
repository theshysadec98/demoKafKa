package com.example.listentopic.service;

import com.example.listentopic.model.entity.Traffic;
import com.example.listentopic.model.response.TrafficResponse;
import com.example.listentopic.repository.TrafficRepository;

import java.util.List;

public interface TrafficService {
    List<TrafficResponse> fetchTraffic();
    List<Traffic> createOrUpdate(List<TrafficResponse> trafficResponse);

    void sendKafka(List<Traffic> traffic);
}
