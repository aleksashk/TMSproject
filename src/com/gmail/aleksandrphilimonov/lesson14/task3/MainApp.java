package com.gmail.aleksandrphilimonov.lesson14.task3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = scanner.nextInt();

        if (value == 1) {
            FunctionalInterfaceExample<String> interfaceExample = value1 -> {
                StringBuilder sb = new StringBuilder(value1);
                sb.reverse();
                return sb.toString();
            };
            System.out.println(interfaceExample.execute("12345"));
        } else if (value == 2) {
            FunctionalInterfaceExample<Integer> interfaceExample = value1 -> {
                int result = 1;
                for (int i = 1; i <= value1; i++) {
                    result *= i;
                }
                return result;
            };
            System.out.println(interfaceExample.execute(5));
        }
    }
}


