package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task5;

public class MainApp {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10; i++, j = -5) {
            System.out.print(i * j + ", ");
        }
    }
}
