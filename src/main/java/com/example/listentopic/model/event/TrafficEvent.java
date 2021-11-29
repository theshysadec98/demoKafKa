package com.example.listentopic.model.event;

import com.example.listentopic.model.entity.Status;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class TrafficEvent {

    private DataStatusEvent data;

    private String highway;

    private String name;

    private Timestamp timestamp;
}
