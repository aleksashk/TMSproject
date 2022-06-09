package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task8;

import java.util.Scanner;

//Получить конечную сумму вклада в зависимости от введенных количества месяцев и суммы вклада
//с учетом того, что каждый месяц к вкладу прибавляется 7%

public class MainApp {
    public static void main(String[] args) {
        String msg = "Enter an amount: ";
        printer(msg);
        float amount = setAmount();

        msg = "Enter a number of months: ";
        printer(msg);
        int numberOfMonth = getNumberOfMonth();

        int percent = 7;

        for (int i = 0; i < numberOfMonth; i++) {
            amount += amount * percent / 100;
            System.out.println(amount);
        }
        System.out.print("\t" + amount);
    }

    public static float setAmount() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String msg = "Enter correct amount! The amount should be more than 0: ";
        while (!checkValidAmount(string)) {
            printer(msg);
            string = scanner.next();
        }
        return Float.parseFloat(string);
    }

    public static int getNumberOfMonth() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String msg = "Enter correct number of months! The number of months should be more than 0: ";
        while (!checkValidNumberOfMonth(string)) {
            printer(msg);
            string = scanner.next();
        }
        return Integer.parseInt(string);
    }

    public static boolean checkValidAmount(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkValidNumberOfMonth(String string) {
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
