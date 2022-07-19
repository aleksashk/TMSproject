package com.gmail.aleksandrphilimonov.lesson14.classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class MainApp {
//    public static void main(String[] args) throws ParseException {
//        System.out.println("Enter data like: dd/MM/yyyy: ");
//        Scanner scanner = new Scanner(System.in);
//        String dateString = scanner.nextLine();
//
//        isData(dateString);
//
//        isDataValid(dateString);
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date date = formatter.parse(dateString);
//
//        LocalDate localDate = date.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//        System.out.println("Data: " + dateString + " is " + localDate.getDayOfWeek().toString());
//    }
//
//    private static void isDataValid(String dateString) {
//        String[] sArray = dateString.split("/");
//        int day = isValueLessThan10(sArray, 0);
//        int month = Integer.parseInt(sArray[1]);
//        int year = Integer.parseInt(sArray[2]);
//        if (month == 1
//                || month == 3
//                || month == 5
//                || month == 7
//                || month == 8
//                || month == 10
//                || month == 12
//                && day > 31) {
//            System.out.println("Invalid input: " + sArray[1] + " should be " +
//                    "01 or 03 or 05 or 07 or 08 or 10 or 12 and " + sArray[0] +
//                    "should be from 0 to 31");
//        } else if (month == 4
//                || month == 6
//                || month == 9
//                || month == 11
//                && day > 30) {
//            System.out.println("Invalid input: " + sArray[1] + " should be " +
//                    "04 or 06 or 09 or 11 and " + sArray[0] +
//                    "should be from 0 to 30");
//        } else if (month == 2) {
//            if (year % 4 == 0) {
//                if ((year % 100 != 0) || (year % 400 == 0) && day > 29) {
//                    System.out.println("Invalid input: " + sArray[1] + " should be " +
//                            "02 and " + sArray[0] +
//                            "should be from 0 to 29");
//                }
//            }
//        }
//    }
//
//    private static void isData(String dateString) {
//        String[] sArray = dateString.split("/");
//        for (int i = 0; i < sArray.length; i++) {
//            int number = isValueLessThan10(sArray, i);
//            try {
//                Integer.parseInt(number);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input: " + sArray[i] + " should be only number!!!");
//            }
//        }
//    }
//
//    private static int isValueLessThan10(String[] sArray, int i) {
//        String sNumber = sArray[i];
//        if ("0".equals(sArray[i].substring(0, 1))) {
//            sNumber = sArray[i].substring(1);
//        }
//        return Integer.parseInt(sNumber);
//    }
}
