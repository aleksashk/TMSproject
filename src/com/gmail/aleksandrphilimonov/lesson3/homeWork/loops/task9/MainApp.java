package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task9;

//Вывести на экран таблицу умножения

public class MainApp {
    public static void main(String[] args) {
        printBorder();
        String msg;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                printExpression(i, j);
            }
            msg = "\n";
            print(msg);
            printBorder();
        }
        msg = "\b\b";
        print(msg);
    }

    private static void printExpression(int i, int j) {
        String msg;
        msg = "" + i + " * " + j + " = " + i * j + "\t|\t";
        print(msg);
    }

    private static void printBorder() {
        String msg = "_________________________________________________________________________________________________________________________________________________\n|\t";
        print(msg);
    }

    private static void print(String msg) {
        System.out.print(msg);
    }
}
