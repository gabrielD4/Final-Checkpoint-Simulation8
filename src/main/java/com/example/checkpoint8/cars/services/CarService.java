package com.example.checkpoint8.cars.services;

import com.example.checkpoint8.cars.entities.Car;
import com.example.checkpoint8.cars.repositories.CarRepository;
import com.example.checkpoint8.pilots.repositories.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private PilotRepository pilotRepository;

    public Car create(Car car) {
        if (car.getMaxSpeed() < 0) {
            throw new IllegalArgumentException();
        } // chiedere  perchè non andava car.getMaxSpeed() < pilotRepository.getReferenceById(car.getAssignedPilot().getId()).getSpeedRecord()
        if (pilotRepository.findById(car.getAssignedPilot().getId()).isPresent() && car.getMaxSpeed() < pilotRepository.findById(car.getAssignedPilot().getId()).get().getSpeedRecord()) {
            throw new IllegalArgumentException();
        }
        return carRepository.save(car);
    }

    public Car getBy(long pilotId) {
        return carRepository.getCarByAssignedPilotId(pilotId);
    }

    public Car getMaxSpeedCar() {
        return carRepository.findTopByOrderByMaxSpeedDesc();
    }
}
