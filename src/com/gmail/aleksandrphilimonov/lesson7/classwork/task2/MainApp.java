package com.gmail.aleksandrphilimonov.lesson7.classwork.task2;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.employee.Accountant;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.employee.Director;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.employee.Worker;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.model.interfaces.Positionable;

public class MainApp {
    public static void main(String[] args) {
        Positionable[] positions = {
                new Accountant("4323455001", "Mel Gibson", 1245.06),
                new Worker("7170001232", "Gennifer Lopes", 560.40),
                new Director("4122005779", "Jim Kerry", 150000.00)
        };

        for (Positionable e : positions) {
            e.printPosition();
        }
    }
}
