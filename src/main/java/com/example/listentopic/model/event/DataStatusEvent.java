package com.example.listentopic.model.event;

import com.example.listentopic.model.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DataStatusEvent {
    private List<Status> saturation;

    private List<Status> speed;

    private List<Status> vehicles;
}
