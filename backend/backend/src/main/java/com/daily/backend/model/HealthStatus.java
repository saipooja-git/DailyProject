package com.daily.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "health")
public class HealthStatus {

    @Id
    private String id;
    private String service;
    private String status;

    // ✅ Required by Spring Data
    public HealthStatus() {
    }

    // Convenience constructor
    public HealthStatus(String service, String status) {
        this.service = service;
        this.status = status;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getService() {
        return service;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setService(String service) {
        this.service = service;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
