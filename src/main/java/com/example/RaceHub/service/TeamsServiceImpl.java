package com.example.RaceHub.service;

import com.example.RaceHub.models.Team;
import com.example.RaceHub.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamsServiceImpl implements  teamService{

    @Autowired
    private TeamRepository repo;
    @Override
    public Team saveTeam(Team team) {
        return repo.save(team);
    }

    @Override
    public List<Team> GetAllTeam() {
        return repo.findAll();
    }

        @Override
        public Optional<Team> getTeamByiD(long id)
        {
            return repo.findAllById(id);
        }

    @Override
    public Team updateTeam(Team team, long id) {
        return null;
    }

    @Override
    public void deleteTeam(long id) {
        repo.findById(id).orElseThrow(()-> new RuntimeException());
        //delete
        repo.deleteById(id);
    }
}
