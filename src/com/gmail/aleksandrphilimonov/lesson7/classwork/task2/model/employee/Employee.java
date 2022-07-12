package com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.employee;

public abstract class Employee {
    private String id;
    private String fullName;
    private double salary;

    public Employee(String id, String fullName, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
