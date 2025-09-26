package com.example.RaceHub.repository;

import com.example.RaceHub.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository  extends JpaRepository<Driver,Long> {
}
