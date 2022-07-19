package com.gmail.aleksandrphilimonov.lesson14.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        LocalDate Thursday = getThursday();
        System.out.println("Date of the next Thursday: " + Thursday);
    }

    private static LocalDate getThursday() {
        LocalDate date = LocalDate.now().plusDays(1);
        while (!isDayThursday(date)) {
            date = date.plusDays(1);
        }
        return date;
    }

    private static boolean isDayThursday(LocalDate date) {
        return date.getDayOfWeek().equals(DayOfWeek.THURSDAY);
    }
}