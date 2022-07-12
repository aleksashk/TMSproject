package com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model.entity;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        UtilityClass.printer("Dentist treats\n");
    }
}
