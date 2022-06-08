package com.gmail.aleksandrphilimonov.lesson3.classWork.task2;

public class MainApp {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i <= 99; i++, j++) {
            System.out.print(++i + ", ");
            if (j == 10) {
                System.out.println();
                j = 0;
            }
        }
    }
}
