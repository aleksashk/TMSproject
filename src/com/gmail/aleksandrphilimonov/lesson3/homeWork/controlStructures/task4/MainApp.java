package com.gmail.aleksandrphilimonov.lesson3.homeWork.controlStructures.task4;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String msg = "enter a temperature: ";
        printer(msg);

        Scanner scanner = new Scanner(System.in);

        int temperature = setNumber(scanner);

        if (temperature > -5) {
            System.out.print("the weather is hot");
        } else if (temperature < -5 & temperature > -20) {
            System.out.print("the weather is normal");
        } else {
            System.out.print("the weather is cold");
        }
    }

    public static int setNumber(Scanner scanner) {
        String string = scanner.nextLine();
        String msg = "Enter only a temperature: ";
        while (!checkValidValue(string)) {
            printer(msg);
            string = scanner.next();
        }
        return Integer.parseInt(string);
    }

    public static boolean checkValidValue(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void printer(String msg) {
        System.out.print(msg);
    }
}
