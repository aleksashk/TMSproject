package com.gmail.aleksandrphilimonov.lesson2.task2.task2_2;

import java.util.Scanner;

import static com.gmail.aleksandrphilimonov.lesson2.task2.task2_3.MainApp.checkerCorrectValue;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a = ");
        String a = scanner.next();

        while (checkerCorrectValue(String.valueOf(a))) {
            System.out.println("wrong value. enter only number");
            a = scanner.next();
        }

        int valueA = Integer.parseInt(a);
        System.out.print("enter b = ");
        String b = scanner.next();

        while (checkerCorrectValue(String.valueOf(b))) {
            System.out.println("wrong value. enter only number");
            b = scanner.next();
        }

        int valueB = Integer.parseInt(b);
        System.out.println("a + b = " + (valueA + valueB));
        System.out.println("a - b = " + (valueA - valueB));
    }
}
