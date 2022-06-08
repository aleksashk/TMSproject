package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task1;

//Вывести в консоль все нечентые числа от 1 до 99
public class MainApp {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
