package com.managementSystem.v1;

import java.util.ArrayList;

public class lecturer {
    private int lecturerId;
    private String firstName;
    private String surName;
    private String gender;
    private String email;
    private String DOB;
    private ArrayList<String> qualifications;

    public lecturer(int lecturerId, String firstName, String surName, String gender, String email, String DOB, ArrayList<String> qualifications) {
        this.lecturerId = lecturerId;
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.email = email;
        this.DOB = DOB;
        this.qualifications = qualifications;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
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

    public ArrayList<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(ArrayList<String> qualifications) {
        this.qualifications = qualifications;
    }
}
