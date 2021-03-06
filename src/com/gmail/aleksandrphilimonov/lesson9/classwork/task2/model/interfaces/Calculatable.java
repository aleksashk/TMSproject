package com.gmail.aleksandrphilimonov.lesson9.classwork.task2.model.interfaces;

import com.gmail.aleksandrphilimonov.lesson9.classwork.task2.model.entity.Vector;

public interface Calculatable {

    double getVectorLength();

    double getScalarMultiplicationOfVectors(Vector firstV, Vector secondV);

    Vector getSumOfVectors(Vector firstV, Vector secondV);

    Vector getSubtractingOfVectors(Vector firstV, Vector secondV);
}
