package com.example.listentopic.model.event;


import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;


@Getter
@Setter
public class TrafficEvent {

    private DataStatusEvent data;

    private String highway;

    private String name;

    private Timestamp timestamp;
}
