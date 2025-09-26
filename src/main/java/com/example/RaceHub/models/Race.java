package com.example.RaceHub.models;

import jakarta.persistence.*;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(length = 255)
    private String name;
    @Column(length = 255)
    private  String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private  String date;


    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
