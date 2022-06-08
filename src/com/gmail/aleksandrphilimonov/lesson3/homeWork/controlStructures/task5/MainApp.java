package com.gmail.aleksandrphilimonov.lesson3.homeWork.controlStructures.task5;

import java.util.Scanner;

import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.printer;
import static com.gmail.aleksandrphilimonov.lesson3.classWork.task1.MainApp.setMonthNumber;

//Вывести в консоль значение цвета радуги в зависимости от введенного значения от 1 до 7
public class MainApp {
    public static void main(String[] args) {
        String msg = "enter NUMBER of color in the rainbow: ";
        printer(msg);

        Scanner scanner = new Scanner(System.in);

        int monthNumber = setMonthNumber(scanner);

        switch (monthNumber) {
            case 1:
                System.out.print("Red");
                return;
            case 2:
                System.out.print("Orange");
                return;
            case 3:
                System.out.print("Yellow");
                return;
            case 4:
                System.out.print("Green");
                return;
            case 5:
                System.out.print("Light Blue");
                return;
            case 6:
                System.out.println("Blue");
                return;
            case 7:
                System.out.print("Purple");
                return;
            default:
                System.out.print("Wrong number. The number should be between 1 and 7");
        }
    }
}
