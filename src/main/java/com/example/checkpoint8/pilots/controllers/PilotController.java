package com.example.checkpoint8.pilots.controllers;

import com.example.checkpoint8.pilots.entities.Pilot;
import com.example.checkpoint8.pilots.services.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/pilots")
public class PilotController {

    @Autowired
    private PilotService pilotService;

    @PostMapping
    public ResponseEntity<Pilot> create(@RequestBody Pilot pilot) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pilotService.create(pilot));
    }
}
