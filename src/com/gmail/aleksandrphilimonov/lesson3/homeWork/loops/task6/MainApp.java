package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task6;

//Вывести квадраты чисел от 10 до 20 включительно

public class MainApp {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
    }
}
