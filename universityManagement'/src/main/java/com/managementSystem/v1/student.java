package com.managementSystem.v1;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class student {

    private int studentId;
    private String firstName;
    private String surName;
    private String gender;
    private String email;
    private String DOB;

    public student(String firstName, String surName, String gender, String email, String DOB) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.email = email;
        this.DOB = DOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
