package com.example.listentopic.repository;

import com.example.listentopic.model.entity.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrafficRepository extends JpaRepository<Traffic, Long> {
}
