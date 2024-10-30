package com.example.world_adventures.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.world_adventures.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findById(int id);
}