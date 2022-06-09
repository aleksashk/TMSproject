package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task3;

import java.util.Scanner;

//Вывести сымму всех чисел от 1 до введенного положительного значения
public class MainApp {
    public static void main(String[] args) {
        String msg = "Enter only positive number: ";
        print(msg);
        int number = getNumber();
        if (number == 0) {
            print("number shoul");
        }
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static int getNumber() {
        String msg = "Enter only positive number: ";
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!checkValidValue(string)) {
            print(msg);
            string = scanner.next();
        }
        int number = Integer.parseInt(string);
        while (number <= 0) {
            print(msg);
            number = getNumber();
        }
        return number;
    }

    public static boolean checkValidValue(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void print(String s) {
        System.out.print(s);
    }


}
