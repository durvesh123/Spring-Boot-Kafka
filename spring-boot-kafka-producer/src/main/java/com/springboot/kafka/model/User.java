package com.springboot.kafka.model;

public class User {

    private String name;
    private String department;
    private Long salary;

    public User() {

    }

    public User(String name, String department, Long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}