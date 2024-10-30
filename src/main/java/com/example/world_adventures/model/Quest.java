package com.example.world_adventures.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="quest", schema="public", catalog="")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "about")
    private String about;

    @Basic
    @Column(name = "cost_money", nullable = false)
    private int costMoney;

    @Basic
    @Column(name = "cost_soul", nullable = false)
    private int costSoul;

    @Basic
    @Column(name = "reward_money", nullable = false, length = 200)
    private int rewardMoney;

    @Basic
    @Column(name = "reward_soul", nullable = false)
    private int rewardSoul;

    @Basic
    @Column(name = "result_text", nullable = false, length = 200)
    private String resultText;

    @ManyToOne
    @JoinColumn(name = "id_player", referencedColumnName = "id", nullable = false)
    private Player player;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getCostMoney() {
        return costMoney;
    }

    public void setCostMoney(int cost) {
        this.costMoney = cost;
    }

    public int getCostSoul() {
        return costSoul;
    }

    public void setSoulCost(int soulCost) {
        this.costSoul = soulCost;
    }

    public int getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(int rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public int getRewardSoul() {
        return rewardSoul;
    }

    public void setRewardCost(int rewardCost) {
        this.rewardSoul = rewardCost;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
