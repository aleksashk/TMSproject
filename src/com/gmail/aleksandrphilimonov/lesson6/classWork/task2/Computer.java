package com.gmail.aleksandrphilimonov.lesson6.classWork.task2;

public class Computer {
    private double cost;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
