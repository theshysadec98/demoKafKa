package com.example.listentopic.model.response;

import com.example.listentopic.model.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class DataStatusResponse {
    private List<Status> saturation;

    private List<Status> speed;

    private List<Status> vehicles;
}
