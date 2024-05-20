package com.example.checkpoint8.pilots.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Pilot {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int speedRecord;

    public Pilot() {
    }

    public Pilot(long id, String name, int speedRecord) {
        this.id = id;
        this.name = name;
        this.speedRecord = speedRecord;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRecord() {
        return speedRecord;
    }

    public void setSpeedRecord(int speedRecord) {
        this.speedRecord = speedRecord;
    }
}
