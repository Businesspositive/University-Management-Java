package com.managementSystem.v1.Entity;
import jakarta.persistence.*;

@Entity
public class Decision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String decisionType; // "Award", "Resit", "Withdraw", etc.

    // Add other fields as needed

    // Getters and setters
}

