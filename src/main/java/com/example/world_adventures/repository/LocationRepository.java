package com.example.world_adventures.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.world_adventures.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
    Location findById(int id);
}