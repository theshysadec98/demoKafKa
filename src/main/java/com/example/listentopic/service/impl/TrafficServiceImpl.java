package com.example.listentopic.service.impl;

import com.example.listentopic.internal.publisher.KafkaPublisher;
import com.example.listentopic.model.entity.DataStatus;
import com.example.listentopic.model.entity.Traffic;
import com.example.listentopic.model.response.DataStatusResponse;
import com.example.listentopic.model.response.TrafficResponse;
import com.example.listentopic.model.response.TrafficStorageResponse;
import com.example.listentopic.repository.DataStatusRepository;
import com.example.listentopic.repository.StatusRepository;
import com.example.listentopic.repository.TrafficRepository;
import com.example.listentopic.service.TrafficService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TrafficServiceImpl implements TrafficService {

    private static final Logger logger = LoggerFactory.getLogger(TrafficServiceImpl.class);

    @Autowired
    private TrafficRepository trafficRepository;

    private KafkaPublisher kafkaPublisher;

//    @Value("${external.google.bucket-name}")
//    private String bucketName;
//
//    @Value("${external.kafka.topic}")
//    private String kafkaTopic;
//
//    @Value("${external.google.storage.path}")
//    private String storagePath;

    @Value("#{appBean.configMap.get('a.1')}")
    private String value;

    public TrafficServiceImpl(TrafficRepository trafficRepository,
                              KafkaPublisher kafkaPublisher) {
        this.trafficRepository = trafficRepository;
        this.kafkaPublisher = kafkaPublisher;
    }

    @Override
    public List<TrafficResponse> fetchTraffic() {
        logger.info(value);
        logger.info("Fetch Traffic from Google Storage Bucket");
        TrafficStorageResponse response = fetchTrafficStorage();
        return response == null ? null : response.getItem();
    }

    @Override
    public List<Traffic> createOrUpdate(List<TrafficResponse> trafficResponse) {
        if ( CollectionUtils.isEmpty(trafficResponse)) {
            logger.info("Not found storage items");
            return null;
        }
//        DataStatusResponse dataStatusResponse = trafficResponse;
        Timestamp timestamp =new Timestamp(System.currentTimeMillis());

//        List<Traffic> trafficList = trafficResponse.stream().map(item -> {
//            Traffic entity = new Traffic();
//
//            entity.setHighway(item.getHighway());
//            entity.setName(item.getName());
//
//            return  entity;
//        })
        return null;
    }

    @Override
    public void saveTraffic(Traffic traffic) {
        trafficRepository.save(traffic);
    }

    @Override
    public void sendKafka(List<Traffic> traffic) {

    }

    private TrafficStorageResponse fetchTrafficStorage() {
        RestTemplate restTemplate = new RestTemplate();
        String url =  "/o";
        ResponseEntity<TrafficStorageResponse> response = restTemplate.getForEntity(url, TrafficStorageResponse.class);
        return response.getBody();
    }



}
