package com.example.RaceHub.controllers;


import com.example.RaceHub.models.Results;
import com.example.RaceHub.repository.ResultRepository;
import com.example.RaceHub.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class ResultsController {

    @Autowired
    private   ResultRepository resultRepository;
    @Autowired
    private ResultsService resultService;

    public ResultsController(ResultRepository resultRepository, ResultsService resultService) {
        this.resultRepository = resultRepository;
        this.resultService = resultService;
    }


    @GetMapping("/races/{id}/results")
    public List<Results> getResultsByRace(@PathVariable Long id) {
       return resultRepository.findByRaceRaceId(id);
    }


    @PostMapping("/results")
    public ResponseEntity<Results> createResults(@RequestBody Results results)
    {
        try {
            Results newResults= resultService.createResult(results);
            return new ResponseEntity<>(newResults, HttpStatus.CREATED);
        }
        catch (IllegalArgumentException e) {

            System.err.println("Validation error: " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
