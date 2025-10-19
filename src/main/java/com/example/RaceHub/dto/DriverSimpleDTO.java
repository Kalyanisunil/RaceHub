package com.example.RaceHub.dto;

public class DriverSimpleDTO {

    private String name;   // This will map to firstName in your entity
    private Long teamId;   // ID of the team to link

    // Constructors
    public DriverSimpleDTO() {}

    public DriverSimpleDTO(String name, Long teamId) {
        this.name = name;
        this.teamId = teamId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getTeamId() {
        return teamId;
    }
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
