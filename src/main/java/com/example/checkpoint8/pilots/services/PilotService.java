package com.example.checkpoint8.pilots.services;

import com.example.checkpoint8.pilots.entities.Pilot;
import com.example.checkpoint8.pilots.repositories.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotService {

    @Autowired
    private PilotRepository pilotRepository;

    public Pilot create(Pilot pilot) {
        return pilotRepository.save(pilot);
    }
}
