package com.example.checkpoint8.cars.entities;

import com.example.checkpoint8.pilots.entities.Pilot;
import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    private String plate;
    private long maxSpeed;
    @OneToOne(fetch = FetchType.EAGER)
    private Pilot assignedPilot;

    public Car() {
    }

    public Car(String plate, long maxSpeed, Pilot assignedPilot) {
        this.plate = plate;
        this.maxSpeed = maxSpeed;
        this.assignedPilot = assignedPilot;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Pilot getAssignedPilot() {
        return assignedPilot;
    }

    public void setAssignedPilot(Pilot assignedPilot) {
        this.assignedPilot = assignedPilot;
    }
}
