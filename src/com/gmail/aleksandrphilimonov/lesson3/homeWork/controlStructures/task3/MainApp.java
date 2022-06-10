package com.gmail.aleksandrphilimonov.lesson3.homeWork.controlStructures.task3;

import java.util.Scanner;

//Вывести на консоль сообщение о четности введенного числа
public class MainApp {
    public static void main(String[] args) {
        String msg = "enter a NUMBER: ";
        printer(msg);

        Scanner scanner = new Scanner(System.in);

        int number = getNumber(scanner);

        if (number % 2 == 0) {
            System.out.print("the number " + number + " is even");
        } else {
            System.out.print("the number " + number + " is odd");
        }
    }

    public static int getNumber(Scanner scanner) {
        String string = scanner.nextLine();
        String msg = "Enter only a number: ";
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
