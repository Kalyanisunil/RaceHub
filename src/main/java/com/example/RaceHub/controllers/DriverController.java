package com.example.RaceHub.controllers;

import com.example.RaceHub.dto.DriverSimpleDTO;

import com.example.RaceHub.models.Driver;
import com.example.RaceHub.models.Team;
import com.example.RaceHub.service.TeamsServiceImpl;
import com.example.RaceHub.service.driverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {


    @Autowired
    private TeamsServiceImpl teamService;
    private List<Driver> theDrivers;
    @Autowired
    private driverService Service;
    @GetMapping("/drivers")
    public List<Driver> fetchDriver()
    {

           theDrivers= Service.fetchAndSaveDriver();
           return theDrivers;
    }

    @GetMapping("/drivers/{id}")
    public Driver fetchDriverById(@PathVariable long id)
    {
            return Service.getDriverById(id);
    }


    @PostMapping("/drivers")
    public ResponseEntity<?> saveDriver(@RequestBody DriverSimpleDTO driverDTO) {
        // 1️⃣ Find the team
        Team team = teamService.getTeamByiD(driverDTO.getTeamId()).orElse(null);

        if (team == null) {
            return new ResponseEntity<>("Team not found", HttpStatus.NOT_FOUND);
        }

        // 2️⃣ Create new Driver and link to team
        Driver driver = new Driver();
        driver.setFirstName(driverDTO.getName());
        driver.setTeam(team);
        Driver savedDriver = Service.saveDriver(driver);



        return new ResponseEntity<>(savedDriver, HttpStatus.CREATED);
    }
}
