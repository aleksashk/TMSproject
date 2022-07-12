package com.gmail.aleksandrphilimonov.lesson6.classWork.task2.model;

public class Ram {
    private String name;
    private String value;

    public Ram() {
        this.name = "noname";
        this.value = "1GB";
    }

    public Ram(String name, String value) {
        this.name = name;
        this.value = value;
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":[" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ']';
    }
}
