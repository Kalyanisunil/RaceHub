package com.example.RaceHub.service;


import com.example.RaceHub.models.Team;
import com.example.RaceHub.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class teamService {

    private TeamRepository teamrepo;

    public teamService(TeamRepository teamRepository ) {
        this.teamrepo = teamRepository;
    }

    private List<Team> getAllTeam()
     {
      return teamrepo.findAll();
     }
}
