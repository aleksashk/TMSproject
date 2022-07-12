package com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.employee;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.interfaces.Positionable;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class Accountant extends Employee implements Positionable {
    public Accountant(String id, String fullName, double salary) {
        super(id, fullName, salary);
    }

    @Override
    public void printPosition() {
        UtilityClass.printer(getClass().getSimpleName() + "\n");
    }
}
