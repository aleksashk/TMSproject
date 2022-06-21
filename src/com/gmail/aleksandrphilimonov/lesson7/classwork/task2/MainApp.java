package com.gmail.aleksandrphilimonov.lesson7.classwork.task2;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.workerType.Accountant;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.workerType.Director;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.workerType.Employee;
import com.gmail.aleksandrphilimonov.lesson7.classwork.task2.workerType.Worker;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Accountant(),
                new Worker(),
                new Director()
        };

        for (Employee e : employees) {
            e.printEmployeesPosition();
        }
    }
}
