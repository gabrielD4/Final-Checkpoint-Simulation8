package com.example.checkpoint8.cars.controllers;

import com.example.checkpoint8.cars.entities.Car;
import com.example.checkpoint8.cars.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car) {
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(car));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/{pilotId}")
    public Car getBy(@PathVariable long pilotId) {
       return carService.getBy(pilotId);
    }

    @GetMapping
    public Car getMaxSpeedCar(){
        return carService.getMaxSpeedCar();
    }

}
