package com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model;

public abstract class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public abstract void treat();
}
