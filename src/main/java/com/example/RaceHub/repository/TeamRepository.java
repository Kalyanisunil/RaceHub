package com.example.RaceHub.repository;

import com.example.RaceHub.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team,Long> {



    Optional<Team> findAllById(Long id);

}
