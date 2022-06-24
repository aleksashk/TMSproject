package com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        UtilityClass.printer(getClass().getSimpleName() + " treats\n");
    }
}
