package com.example.RaceHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.transform.Result;
import java.util.List;

public interface ResultRepository extends JpaRepository<Result,Long> {
    List<Result> findByRaceId(Long raceId);

}
