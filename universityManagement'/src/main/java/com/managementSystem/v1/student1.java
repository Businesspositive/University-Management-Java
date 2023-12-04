package com.managementSystem.v1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class student1 {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "MARK")
    private int mark;
    @Column(name = "NAME")
    private String name;

    public student1(int id, int mark, String name) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
