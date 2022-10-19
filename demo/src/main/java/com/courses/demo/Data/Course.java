package com.courses.demo.Data;

public class Course {
    private long id;
    private String name;
    private String description;
    private static long idCounter = 0;

    public Course(String name, String description) {
        this.id = idCounter++;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
