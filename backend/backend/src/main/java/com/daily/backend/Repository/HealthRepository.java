package com.daily.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.daily.backend.model.HealthStatus;

public interface HealthRepository extends MongoRepository<HealthStatus, String> {
}
