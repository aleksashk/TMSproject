package com.gmail.aleksandrphilimonov.lesson9.classwork.task2.model.entity;

import com.gmail.aleksandrphilimonov.lesson9.classwork.task2.model.interfaces.Calculatable;

import java.util.Arrays;

public class Vector implements Calculatable {
    private int[] coordinates;

    public Vector(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "This is vector of " + coordinates.length + " dimensional coordinate system{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(coordinates, vector.coordinates);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coordinates);
    }

    public double getVectorLength() {
        double length = 0;
        for (int coordinate : coordinates) {
            length += Math.pow(coordinate, 2);
        }
        return length;
    }

    @Override
    public double getScalarMultiplicationOfVectors(Vector firstV, Vector secondV) {
        double result = 0;
        for (int i = 0; i < firstV.getCoordinates().length; i++) {
            result += firstV.getCoordinates()[i] * secondV.getCoordinates()[i];
        }
        return result;
    }

    @Override
    public Vector getSumOfVectors(Vector firstV, Vector secondV) {
        int[] resultCoordinates = new int[firstV.getCoordinates().length];
        for (int i = 0; i < resultCoordinates.length; i++) {
            resultCoordinates[i] = firstV.getCoordinates()[i] + secondV.getCoordinates()[i];
        }
        return new Vector(resultCoordinates);
    }

    @Override
    public Vector getSubtractingOfVectors(Vector firstV, Vector secondV) {
        int[] resultCoordinates = new int[firstV.getCoordinates().length];
        for (int i = 0; i < resultCoordinates.length; i++) {
            resultCoordinates[i] = firstV.getCoordinates()[i] - secondV.getCoordinates()[i];
        }
        return new Vector(resultCoordinates);
    }
}
