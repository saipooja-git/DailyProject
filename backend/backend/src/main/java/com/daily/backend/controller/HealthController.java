package com.daily.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily.backend.model.HealthStatus;
import com.daily.backend.repository.HealthRepository;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final HealthRepository healthRepository;

    public HealthController(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    // ✅ POST: Save data into MongoDB
    @PostMapping
    public HealthStatus saveHealth(@RequestBody HealthStatus healthStatus) {
        return healthRepository.save(healthStatus);
    }

    // ✅ GET: Fetch data from MongoDB
    @GetMapping
    public List<HealthStatus> getAllHealth() {
        return healthRepository.findAll();
    }

    // @GetMapping("/api/health")
    // public Map<String, String> health() {
    //     return Map.of("service", "backend", "status", "ok");
    // }
}
