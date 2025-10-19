package com.example.RaceHub.service;


import com.example.RaceHub.models.Team;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface teamService {

    Team saveTeam(Team team);
    List<Team> GetAllTeam();

    Optional<Team> getTeamByiD(long id);

    Team updateTeam(Team team, long id);
    void deleteTeam(long id);


}
