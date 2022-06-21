package com.gmail.aleksandrphilimonov.lesson7.classwork.task2.workerType;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class Director  implements Employee{
    @Override
    public void printEmployeesPosition() {
        UtilityClass.printer(getClass().getSimpleName() + "\n");
    }
}
