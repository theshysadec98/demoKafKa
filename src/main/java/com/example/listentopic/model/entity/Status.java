package com.example.listentopic.model.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "status")
public class Status implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "direction")
    private String direction;

    @Column(name = "lane")
    private String lane;

    @Column(name = "value")
    private Long value;
}
