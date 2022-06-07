package com.gmail.aleksandrphilimonov.task2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String invitation = "Введите имя пользователя: ";
        System.out.print(invitation);

        String userName = checkUserName(scanner);
        printMsg(userName);
    }

    private static void printMsg(String userName) {
        System.out.println("Hello " + userName);
    }

    private static String checkUserName(Scanner scanner) {

        String userName = scanner.next();
        String msg = "Имя пользователя не содержит ни одного символа. Введите имя пользователя: ";

        while (userName.length() <= 1) {
            System.out.print(msg);
            userName = scanner.next();
        }
        return userName;
    }
}
