package com.example.RaceHub.service;

import com.example.RaceHub.models.Race;
import com.example.RaceHub.repository.RaceRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class RaceService {

    private RaceRepository raceRepository;

    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }


      public  List<Race> getUpcomingRaces()
        {
            return raceRepository.findAll();
        }

    public Optional<Race> getRaceById(long id) {


        Optional<Race> race=raceRepository.findById(id);
        return race;
    }
}
