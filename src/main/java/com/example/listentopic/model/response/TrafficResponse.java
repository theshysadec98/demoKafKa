package com.example.listentopic.model.response;

import com.example.listentopic.model.event.DataStatusEvent;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class TrafficResponse {
    private DataStatusEvent data;

    private String highway;

    private String name;
}
