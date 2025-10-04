package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Driver;
import com.example.RaceHub.service.driverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

    @Autowired
    private driverService Service;
    @GetMapping("/drivers")
    public List<Driver> fetchDriver()
    {
           return  Service.fetchAndSaveDriver();
    }
}
