package com.example.listentopic.model.event;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StatusEvent {
    private String direction;

    private String lane;

    private Long value;
}
