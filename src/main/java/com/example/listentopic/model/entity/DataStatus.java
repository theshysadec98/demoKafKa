package com.example.listentopic.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "data_status")
public class DataStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Status> saturation;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Status> speed;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Status> vehicles;
}
