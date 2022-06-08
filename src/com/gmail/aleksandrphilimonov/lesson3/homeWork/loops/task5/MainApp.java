package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task5;

//Вывести первые 10 чисел последовательности 0, -5, -10, -15, -20, -25, -30, -35, -40, -45
public class MainApp {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10; i++, j = -5) {
            System.out.print(i * j + ", ");
        }
    }
}
