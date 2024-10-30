package com.example.world_adventures.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.world_adventures.model.Quest;

public interface QuestRepository extends JpaRepository<Quest, Long> {
    Quest findById(int id);
}