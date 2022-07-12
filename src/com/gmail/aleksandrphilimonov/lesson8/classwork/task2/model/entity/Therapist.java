package com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model.entity;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class Therapist extends Doctor {

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        UtilityClass.printer("Therapist treat\n");
    }
}
