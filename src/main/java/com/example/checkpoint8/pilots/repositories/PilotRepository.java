package com.example.checkpoint8.pilots.repositories;

import com.example.checkpoint8.pilots.entities.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long> {
}
