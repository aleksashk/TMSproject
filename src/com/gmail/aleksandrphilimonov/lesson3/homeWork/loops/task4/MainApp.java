package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task4;

// Вывести последовательность вида 7 14 21 28 35 42 49 56 63 70 77 84 91 98

public class MainApp {
    public static void main(String[] args) {
        int number = 7;
        int i = 1;
        while ((number * i) <= 98) {
            System.out.print(number * i + " ");
            i++;
        }
    }
}
