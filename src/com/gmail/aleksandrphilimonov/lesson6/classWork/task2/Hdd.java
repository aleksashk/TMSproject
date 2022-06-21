package com.gmail.aleksandrphilimonov.lesson6.classWork.task2;

public class Hdd {
    private String name;
    private String value;
    private String type;

    public Hdd() {
        this.name = "noname";
        this.value = "1GB";
        this.type = "inner";
    }

    public Hdd(String name, String value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
