package com.example.RaceHub.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long raceId;
    private String  name;
    private String season;
    private int round;
    private String circuit;
    private LocalDate date;

    public Race(String circuit, LocalDate date, String name, long
            raceId, int round, String season) {
        this.circuit = circuit;
        this.date = date;
        this.name = name;
        this.raceId = raceId;
        this.round = round;
        this.season = season;
    }
    public Race()
    {

    }

    public long getRaceId() {
        return raceId;
    }

    public void setRaceId(long raceId) {
        this.raceId = raceId;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


    @Override
    public String toString() {
        return "Race{" +
                "circuit='" + circuit + '\'' +
                ", raceId='" + raceId + '\'' +
                ", name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", round=" + round +
                ", date=" + date +
                '}';
    }
}
