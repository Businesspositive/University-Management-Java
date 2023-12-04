package com.managementSystem.v1.Entity;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends User {

    @Column(nullable = false)
    private int maxAllowedAttempts;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Enrollment> enrollments = new HashSet<>();

    // Getters and setters
    public int getMaxAllowedAttempts() {
        return maxAllowedAttempts;
    }

    public void setMaxAllowedAttempts(int maxAllowedAttempts) {
        this.maxAllowedAttempts = maxAllowedAttempts;
    }

    public Set<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public List<Course> getEnrolledCourses() {
    }
}

