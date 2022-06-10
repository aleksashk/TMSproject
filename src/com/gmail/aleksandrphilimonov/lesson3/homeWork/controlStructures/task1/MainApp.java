package com.gmail.aleksandrphilimonov.lesson3.homeWork.controlStructures.task1;

import java.util.Scanner;

import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.printer;
import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.getMonthNumber;

//Вывести на консоль пору года в зависимости от введенного номера месяца используя switch-case
public class MainApp {
    public static void main(String[] args) {
        String msg = "enter NUMBER of month: ";
        printer(msg);

        Scanner scanner = new Scanner(System.in);

        int monthNumber = getMonthNumber(scanner);

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("If month: " + monthNumber + " this is winter");
                return;
            case 3:
            case 4:
            case 5:
                System.out.println("If month: " + monthNumber + " this is spring");
                return;
            case 6:
            case 7:
            case 8:
                System.out.println("If month: " + monthNumber + " this is summer");
                return;
            case 9:
            case 10:
            case 11:
                System.out.println("If month: " + monthNumber + " this is autumn");
                return;
            default:
                System.out.println("Wrong number of month: " + monthNumber);
        }
    }
}
