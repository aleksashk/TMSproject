package com.gmail.aleksandrphilimonov.lesson8.classwork.task1.model;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.util.stream.Stream;

public class Phone {
    private String model;
    private String number;
    private int weight;

    public Phone() {
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        UtilityClass.printer("Звонит " + name + ".\n");
    }

    public void receiveCall(String name, String number) {
        UtilityClass.printer("Звонит " + name + "\n\t" + number + "\n");
    }

    public void sendMessage(String... number) {
        Stream.of(number).forEach(System.out::println);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                '}';
    }
}
