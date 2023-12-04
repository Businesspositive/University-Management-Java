package com.managementSystem.v1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "module_materials")
public class ModuleMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int week;

    @Column(name = "lecture_note_url")
    private String lectureNoteUrl;

    @Column(name = "lab_note_url")
    private String labNoteUrl;

    @ManyToOne
    @JoinColumn(name = "module_id", nullable = false)
    private Module module;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getLectureNoteUrl() {
        return lectureNoteUrl;
    }

    public void setLectureNoteUrl(String lectureNoteUrl) {
        this.lectureNoteUrl = lectureNoteUrl;
    }

    public String getLabNoteUrl() {
        return labNoteUrl;
    }

    public void setLabNoteUrl(String labNoteUrl) {
        this.labNoteUrl = labNoteUrl;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    // Other annotations as needed
}

