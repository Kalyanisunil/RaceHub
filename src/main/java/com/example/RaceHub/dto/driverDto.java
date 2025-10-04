package com.example.RaceHub.dto;

public class driverDto {
        private long id;
        private String broadcast_name;
        private String first_name;
        private String last_name;
        private String full_name;
        private int driver_number;
        private String team_name;
        private String team_colour;
        private String headshot_url;
        private String country_code;

    public driverDto(long id, String broadcast_name, String country_code, int driver_number, String first_name, String full_name, String headshot_url, String last_name, String team_colour, String team_name) {
        this.id = id;
        this.broadcast_name = broadcast_name;
        this.country_code = country_code;
        this.driver_number = driver_number;
        this.first_name = first_name;
        this.full_name = full_name;
        this.headshot_url = headshot_url;
        this.last_name = last_name;
        this.team_colour = team_colour;
        this.team_name = team_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBroadcast_name() {
        return broadcast_name;
    }

    public void setBroadcast_name(String broadcast_name) {
        this.broadcast_name = broadcast_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getHeadshot_url() {
        return headshot_url;
    }

    public void setHeadshot_url(String headshot_url) {
        this.headshot_url = headshot_url;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTeam_colour() {
        return team_colour;
    }

    public void setTeam_colour(String team_colour) {
        this.team_colour = team_colour;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
