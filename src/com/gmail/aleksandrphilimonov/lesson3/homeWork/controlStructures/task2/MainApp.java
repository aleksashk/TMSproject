package com.gmail.aleksandrphilimonov.lesson3.homeWork.controlStructures.task2;

import java.util.Scanner;

import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.printer;
import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.getMonthNumber;

//Вывести на консоль пору года в зависимости от введенного номера месяца используя if-else-if

public class MainApp {
    public static void main(String[] args) {
        String msg = "enter NUMBER of month: ";
        printer(msg);

        Scanner scanner = new Scanner(System.in);

        int monthNumber = getMonthNumber(scanner);

        if (monthNumber == 12 || monthNumber == 1 | monthNumber == 2) {
            System.out.print("If month: " + monthNumber + " this is winter");
        } else if (monthNumber == 3 || monthNumber == 4 | monthNumber == 5) {
            System.out.print("If month: " + monthNumber + " this is spring");
        } else if (monthNumber == 6 || monthNumber == 7 | monthNumber == 8) {
            System.out.print("If month: " + monthNumber + " this is summer");
        } else if (monthNumber == 9 || monthNumber == 10 | monthNumber == 11) {
            System.out.print("If month: " + monthNumber + " this is autumn");
        } else {
            System.out.print("Wrong number of month: " + monthNumber);
        }
    }
}
