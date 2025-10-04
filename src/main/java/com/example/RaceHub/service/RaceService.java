package com.example.RaceHub.service;

import com.example.RaceHub.models.Race;
import com.example.RaceHub.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

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

}
