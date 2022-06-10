package com.gmail.aleksandrphilimonov.lesson3.classWork.task4;

///Вывести на консоль результаты из таблицы умножения
public class MainApp {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("\t" + i * j+ "\t" + "|");
            }
            System.out.println();
        }
    }
}
