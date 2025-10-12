package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Race;
import com.example.RaceHub.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/races/{id}")
    public Optional<Race> fetchRacesById(@PathVariable long id)
    {
        return raceService.getRaceById(id);
    }

}
