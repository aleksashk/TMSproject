package com.gmail.aleksandrphilimonov.lesson8.classwork.task2;

import com.gmail.aleksandrphilimonov.lesson8.classwork.task2.model.Patient;

public class MainApp {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Vasiliy", 2);
        Patient patient2 = new Patient("Elena", 1);
        Patient patient3 = new Patient("Victorya", 3);

        patient1.treatPatient();
        patient2.treatPatient();
        patient3.treatPatient();
    }
}
