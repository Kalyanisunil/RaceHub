package com.example.RaceHub.models;

import jakarta.persistence.*;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; // OpenF1 unique ID

    private String broadcastName;
    private String firstName;
    private String lastName;
    private String fullName;
    private int driverNumber;
    private String teamName;
    private String teamColour;



    private String headshotUrl;
    private String countryCode;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    public Driver()
    {

    }

    public Driver(String broadcastName, String countryCode, int driverNumber, String firstName, String fullName, String headshotUrl, long id, String lastName, Team team, String teamColour, String teamName) {
        this.broadcastName = broadcastName;
        this.countryCode = countryCode;
        this.driverNumber = driverNumber;
        this.firstName = firstName;
        this.fullName = fullName;
        this.headshotUrl = headshotUrl;
        this.id = id;
        this.lastName = lastName;
        this.team = team;
        this.teamColour = teamColour;
        this.teamName = teamName;
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHeadshotUrl() {
        return headshotUrl;
    }

    public void setHeadshotUrl(String headshotUrl) {
        this.headshotUrl = headshotUrl;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamColour() {
        return teamColour;
    }

    public void setTeamColour(String teamColour) {
        this.teamColour = teamColour;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "broadcastName='" + broadcastName + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", driverNumber=" + driverNumber +
                ", teamName='" + teamName + '\'' +
                ", teamColour='" + teamColour + '\'' +
                ", headshotUrl='" + headshotUrl + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", team=" + team +
                '}';
    }
}
