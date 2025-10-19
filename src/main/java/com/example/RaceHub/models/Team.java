package com.example.RaceHub.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String teamName;
    private String teamColor;
    private String country;

    @OneToMany(mappedBy = "team")
    private List<Driver> drivers;

    public Team() {

    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Team(String country, List<Driver> drivers, Long id, String teamColor, String teamName) {
        this.country = country;
        this.drivers = drivers;
        this.id = id;
        this.teamColor = teamColor;
        this.teamName = teamName;
    }

}

