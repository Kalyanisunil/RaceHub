package com.example.RaceHub.controllers;

import com.example.RaceHub.models.Team;
import com.example.RaceHub.service.teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeamControlller {


        @Autowired
        private teamService teamservice;

        @GetMapping("/teams")
        public List<Team> getTeams()
        {
            return teamservice.getAllTeam();

        }

        @GetMapping("/teams/{id}")
        public Optional<Team> fetchById(@PathVariable long id)
        {
            return teamservice.getTeamById(id);
        }

    }


