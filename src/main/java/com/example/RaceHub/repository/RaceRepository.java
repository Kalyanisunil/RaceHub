package com.example.RaceHub.repository;

import com.example.RaceHub.models.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race,Long> {

}
