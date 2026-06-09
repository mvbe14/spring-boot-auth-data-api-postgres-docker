package com.example.auth_api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;  

@Entity
@Table(name = "processing_log")
public class ProcessingLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "input_text", nullable = false, columnDefinition = "TEXT")
    private String inputText;

    @Column(name = "output_text", nullable = false, columnDefinition = "TEXT")
    private String outputText;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }

    public UUID getId() { 
        return id; 
    }

    public void setId(UUID id) { 
        this.id = id; 
    }

    public User getUser() { 
        return user; 
    }

    public void setUser(User user) { 
        this.user = user; 
    }

    public String getInputText() { 
        return inputText; 
    }

    public void setInputText(String inputText) { 
        this.inputText = inputText; 
    }

    public String getOutputText() { 
        return outputText; 
    }

    public void setOutputText(String outputText) { 
        this.outputText = outputText; 
    }

    public LocalDateTime getCreatedAt() { 
        return createdAt; 
    }
}