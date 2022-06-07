package com.gmail.aleksandrphilimonov.task2.task2_3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a = ");
        String a = scanner.next();

        a = correctValue(scanner, a);
        int valueA = Integer.parseInt(a);

        System.out.print("enter b = ");
        String b = scanner.next();

        b = correctValue(scanner, b);
        int valueB = Integer.parseInt(b);

        System.out.print("enter c = ");
        String c = scanner.next();

        c = correctValue(scanner, c);
        int valueC = Integer.parseInt(c);

        double d = (Math.pow(valueB, 2) - 4 * valueA * valueC);
        double D = d * 100 / 100;
        System.out.println("D = " + D);

        if (D < 0) {
            System.out.println("Корней нет");
            return;
        }

        double x = (-valueB + Math.sqrt(D)) / (2 * valueA);

        if (x < 0) {
            x = (-valueB - Math.sqrt(D)) / (2 * valueA);
            System.out.println("x = " + x);
        }

        System.out.println("x = " + x);

        String s = "" + valueA + "*" + Math.pow(x, 2) + " + " + valueB + "*" + x + " + " + valueC;
        System.out.println("ax2 + bx + c = " + (valueA * Math.pow(x, 2) + valueB * x + valueC));
        System.out.println("ax2 + bx + c = 0 => " + s + " = " + 0);
    }

    private static String correctValue(Scanner scanner, String b) {
        while (checkerCorrectValue(String.valueOf(b))) {
            System.out.println("wrong value. Enter only number.");
            b = scanner.next();
        }
        return b;
    }

    public static boolean checkerCorrectValue(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
