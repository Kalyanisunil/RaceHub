package com.example.RaceHub.service;

import com.example.RaceHub.models.Driver;
import com.example.RaceHub.models.Race;
import com.example.RaceHub.models.Results;
import com.example.RaceHub.repository.RaceRepository;
import com.example.RaceHub.repository.ResultRepository;
import com.example.RaceHub.repository.driverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ResultsService {

    @Autowired
    private ResultRepository resultRepo;

    @Autowired
    private driverRepository driverRepo; // inject DriverRepository

    @Autowired
    private RaceRepository raceRepo; // if you also have Race linked

    public Optional<Results> getResultById(long id) {
        return resultRepo.findById(id);
    }

    public List<Results> findByRaceRaceId(long raceId) {
        return resultRepo.findByRaceRaceId(raceId);
    }

    public List<Results> getAllResults() {
        return resultRepo.findAll();
    }

    public Results createResult(Results results)
    {

        //fetching existing driver from db
        Long driverId = results.getDriver().getId();
        try{
            Driver driver = driverRepo.findById(driverId);
            results.setDriver(driver);
        }
        catch (IllegalArgumentException e)
        {
            throw new IllegalArgumentException("driver not found");
        }

        Long raceId = results.getRace().getRaceId();
        Race race = raceRepo.findById(raceId)
                .orElseThrow(() -> new IllegalArgumentException("Race not found with id: " + raceId));

        results.setRace(race);




        return resultRepo.save(results);
    }
}
