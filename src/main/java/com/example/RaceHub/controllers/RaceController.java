package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Race;
import com.example.RaceHub.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RaceController {
        @Autowired
        private RaceService raceService;
@GetMapping("/races")
   public List<Race> getUpcomingRaces()
    {
       return raceService.getUpcomingRaces();

    }

}
