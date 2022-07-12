package com.gmail.aleksandrphilimonov.lesson9.classwork.task1.model.entity;

import java.util.Random;

public class VectorTwoDimensionalCoordinateSystem extends Vector {
    public static final String DESCRIPTION = "This is vector of two dimensional coordinate system";

    public VectorTwoDimensionalCoordinateSystem(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    @Override
    public double getVectorLength() {
        return Math.sqrt(Math.pow(getxCoordinate(), 2) + Math.pow(getyCoordinate(), 2));
    }

    @Override
    public double getScalarMultiplicationOfVectors(Vector firstV, Vector secondV) {
        return (firstV.getxCoordinate() * secondV.getxCoordinate() + firstV.getyCoordinate() * secondV.getyCoordinate());
    }

    @Override
    public VectorTwoDimensionalCoordinateSystem getSumOfVectors(Vector firstV, Vector secondV) {
        int resultXCoordinate = firstV.getxCoordinate() + secondV.getxCoordinate();
        int resultYCoordinate = firstV.getyCoordinate() + secondV.getyCoordinate();
        return new VectorTwoDimensionalCoordinateSystem(resultXCoordinate, resultYCoordinate);
    }

    @Override
    public VectorTwoDimensionalCoordinateSystem getSubtractingOfVectors(Vector firstV, Vector secondV) {
        int resultXCoordinate = firstV.getxCoordinate() - secondV.getxCoordinate();
        int resultYCoordinate = firstV.getyCoordinate() - secondV.getyCoordinate();
        return new VectorTwoDimensionalCoordinateSystem(resultXCoordinate, resultYCoordinate);
    }

    public static VectorTwoDimensionalCoordinateSystem[] getRandomArray(int sizeArray) {
        VectorTwoDimensionalCoordinateSystem[] array = new VectorTwoDimensionalCoordinateSystem[sizeArray];
        fillArray(sizeArray, array);
        return array;
    }

    private static void fillArray(int sizeArray, VectorTwoDimensionalCoordinateSystem[] array) {
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = new VectorTwoDimensionalCoordinateSystem(random.nextInt(), random.nextInt());
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Vector o) {
        return 0;
    }

    @Override
    public String toString() {
        return DESCRIPTION + "\n" + super.toString();
    }
}
