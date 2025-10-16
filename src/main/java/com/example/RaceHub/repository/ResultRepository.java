package com.example.RaceHub.repository;

import com.example.RaceHub.models.Results;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.transform.Result;
import java.util.List;
import java.util.Optional;

public interface ResultRepository extends JpaRepository<Results,Long> {

    List<Results> findByRaceRaceId(Long raceId);
    Optional<Results> findById(Long id);
    List<Results> findAll();

}
