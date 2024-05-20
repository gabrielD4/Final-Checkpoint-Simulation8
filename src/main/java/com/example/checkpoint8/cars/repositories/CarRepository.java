package com.example.checkpoint8.cars.repositories;

import com.example.checkpoint8.cars.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    Car getCarByAssignedPilotId(long pilotId);

    Car findTopByOrderByMaxSpeedDesc();
}

