package com.example.world_adventures.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "locations", schema = "public", catalog = "")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "location_previous",
        joinColumns = @JoinColumn(name = "location_id"),
        inverseJoinColumns = @JoinColumn(name = "previous_location_id")
    )
    private Set<Location> previousLocations = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "location_next",
        joinColumns = @JoinColumn(name = "location_id"),
        inverseJoinColumns = @JoinColumn(name = "next_location_id")
    )
    private Set<Location> nextLocations = new HashSet<>();

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Location> getPreviousLocations() {
        return previousLocations;
    }

    public void setPreviousLocations(Set<Location> previousLocations) {
        this.previousLocations = previousLocations;
    }

    public Set<Location> getNextLocations() {
        return nextLocations;
    }

    public void setNextLocations(Set<Location> nextLocations) {
        this.nextLocations = nextLocations;
    }
}
