package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Driver;
import com.example.RaceHub.service.driverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

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
}
