package com.gmail.aleksandrphilimonov.lesson14.task1;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        final String EXIT = "EXIT";
        Scanner scanner = new Scanner(System.in);
        String msg = "Input number of day or 'EXIT' for exit: ";
        UtilityClass.print(msg);
        String input = scanner.nextLine();
        while (!EXIT.equals(input)) {
            LocalDate day = LocalDate.now().plusDays(Integer.parseInt(input));
            DayOfWeek dayOfWeek = day.getDayOfWeek();
            System.out.println("Day " + day + ": " + dayOfWeek + ";");
            input = scanner.nextLine();
        }
    }
}
