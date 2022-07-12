package com.gmail.aleksandrphilimonov.lesson7.classwork.task1.model.figure;

import com.gmail.aleksandrphilimonov.lesson7.classwork.task1.model.interfaces.Shape;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
