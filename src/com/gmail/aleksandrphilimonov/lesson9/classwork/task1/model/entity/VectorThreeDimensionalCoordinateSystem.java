package com.gmail.aleksandrphilimonov.lesson9.classwork.task1.model.entity;

import java.util.Random;

public class VectorThreeDimensionalCoordinateSystem extends Vector {
    public static final String DESCRIPTION = "This is vector of three dimensional coordinate system";
    private int zCoordinate;

    public VectorThreeDimensionalCoordinateSystem(int xCoordinate, int yCoordinate, int zCoordinate) {
        super(xCoordinate, yCoordinate);
        this.zCoordinate = zCoordinate;
    }

    public int getzCoordinate() {
        return zCoordinate;
    }

    public void setzCoordinate(int zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    @Override
    public double getVectorLength() {
        return Math.sqrt(Math.pow(getxCoordinate(), 2) + Math.pow(getyCoordinate(), 2) + Math.pow(getzCoordinate(), 2));
    }

    @Override
    public double getScalarMultiplicationOfVectors(Vector firstV, Vector secondV) {
        return (firstV.getxCoordinate() * secondV.getxCoordinate() + firstV.getyCoordinate() * secondV.getyCoordinate() + ((VectorThreeDimensionalCoordinateSystem) firstV).getzCoordinate() * ((VectorThreeDimensionalCoordinateSystem) secondV).getzCoordinate());
    }

    @Override
    public VectorThreeDimensionalCoordinateSystem getSumOfVectors(Vector firstV, Vector secondV) {
        int resultXCoordinate = firstV.getxCoordinate() + secondV.getxCoordinate();
        int resultYCoordinate = firstV.getyCoordinate() + secondV.getyCoordinate();
        int resultZCoordinate = ((VectorThreeDimensionalCoordinateSystem) firstV).getzCoordinate() + ((VectorThreeDimensionalCoordinateSystem) secondV).getzCoordinate();
        return new VectorThreeDimensionalCoordinateSystem(resultXCoordinate, resultYCoordinate, resultZCoordinate);
    }

    @Override
    public VectorThreeDimensionalCoordinateSystem getSubtractingOfVectors(Vector firstV, Vector secondV) {
        int resultXCoordinate = firstV.getxCoordinate() - secondV.getxCoordinate();
        int resultYCoordinate = firstV.getyCoordinate() - secondV.getyCoordinate();
        int resultZCoordinate = ((VectorThreeDimensionalCoordinateSystem) firstV).getzCoordinate() - ((VectorThreeDimensionalCoordinateSystem) secondV).getzCoordinate();
        return new VectorThreeDimensionalCoordinateSystem(resultXCoordinate, resultYCoordinate, resultZCoordinate);
    }

    public static VectorThreeDimensionalCoordinateSystem[] getRandomArray(int sizeArray) {
        VectorThreeDimensionalCoordinateSystem[] array = new VectorThreeDimensionalCoordinateSystem[sizeArray];
        fillArray(sizeArray, array);
        return array;
    }

    private static void fillArray(int sizeArray, VectorThreeDimensionalCoordinateSystem[] array) {
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = new VectorThreeDimensionalCoordinateSystem(random.nextInt(), random.nextInt(), random.nextInt());
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
        return DESCRIPTION + "\n"
                + super.toString() +
                ", zCoordinate="
                + zCoordinate;
    }
}
