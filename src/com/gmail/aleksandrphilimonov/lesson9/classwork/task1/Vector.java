package com.gmail.aleksandrphilimonov.lesson9.classwork.task1;

public abstract class Vector implements Calculatable, Comparable<Vector> {
    private int xCoordinate;
    private int yCoordinate;

    public Vector(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Vector:" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate;
    }
}
