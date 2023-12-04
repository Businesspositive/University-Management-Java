package com.managementSystem.v1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "module_id", nullable = false)
    private Module module;

    @Column(name = "lab_mark")
    private Integer labMark;

    @Column(name = "exam_mark")
    private Integer examMark;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Integer getLabMark() {
        return labMark;
    }

    public void setLabMark(Integer labMark) {
        this.labMark = labMark;
    }

    public Integer getExamMark() {
        return examMark;
    }

    public void setExamMark(Integer examMark) {
        this.examMark = examMark;
    }

    // Other annotations as needed
}

