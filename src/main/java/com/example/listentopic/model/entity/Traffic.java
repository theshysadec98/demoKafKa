package com.example.listentopic.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Data
@EqualsAndHashCode
@Entity
@Table(name = "traffic")
public class Traffic implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    private DataStatus data;

    @Column(name = "highway")
    private String highway;

    @Column(name = "name")
    private String name;

    @Column(name = "time_stamp")
    private Timestamp timestamp;

}
