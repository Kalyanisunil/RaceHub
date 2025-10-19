package com.example.RaceHub.service;


import com.example.RaceHub.models.Team;
import com.example.RaceHub.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class teamService {

    private TeamRepository teamrepo;

    public teamService(TeamRepository teamRepository ) {
        this.teamrepo = teamRepository;
    }

    public List<Team> getAllTeam()
     {
      return teamrepo.findAll();
     }

    public Optional<Team> getTeamById(Long id)
    {
        return teamrepo.findAllById(id);
    }



}
