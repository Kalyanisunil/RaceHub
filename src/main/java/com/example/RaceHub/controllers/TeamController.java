package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Team;
import com.example.RaceHub.service.TeamsServiceImpl;
import com.example.RaceHub.service.teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeamController {


    private TeamsServiceImpl teamservice;

    public TeamController(TeamsServiceImpl teamservice) {
        this.teamservice = teamservice;
    }

    @GetMapping("/teams")
        public List<Team> getTeams()
        {
            return teamservice.GetAllTeam();

        }

    @GetMapping("/teams/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable long id) {
        Optional<Team> team = teamservice.getTeamByiD(id);
        return team.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

        @PostMapping("/teams")
    public ResponseEntity<Team> saveTeam(@RequestBody Team team)
        {
            return new ResponseEntity<Team>(teamservice.saveTeam(team),HttpStatus.CREATED);
        }
    }


