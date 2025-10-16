package com.example.RaceHub.models;

import jakarta.persistence.*;

@Entity
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resultId;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "id")
    private Driver driver;

    private String position;

    private long points;

    private Boolean fastest_lap;

    public Results(Driver driver, Boolean fastest_lap, long points, String position, Race race, long resultId) {
        this.driver = driver;
        this.fastest_lap = fastest_lap;
        this.points = points;
        this.position = position;
        this.race = race;
        this.resultId = resultId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Boolean getFastest_lap() {
        return fastest_lap;
    }

    public void setFastest_lap(Boolean fastest_lap) {
        this.fastest_lap = fastest_lap;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public long getResultId() {
        return resultId;
    }

    public void setResultId(long resultId) {
        this.resultId = resultId;
    }

    @Override
    public String toString() {
        return "Results{" +
                "driver=" + driver +
                ", resultId=" + resultId +
                ", race=" + race +
                ", position='" + position + '\'' +
                ", points=" + points +
                ", fastest_lap=" + fastest_lap +
                '}';
    }
}
