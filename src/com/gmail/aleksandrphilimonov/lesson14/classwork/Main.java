package com.gmail.aleksandrphilimonov.lesson14.classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter data like: dd/MM/yyyy: ");
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date date = formatter.parse(dateString);

        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        System.out.println("Data: " + dateString + " is " + localDate.getDayOfWeek().toString());
    }
}
