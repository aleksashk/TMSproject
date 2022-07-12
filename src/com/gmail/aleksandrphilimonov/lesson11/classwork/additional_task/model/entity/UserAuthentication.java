package com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.entity;

import com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.exceptions.WrongLoginException;
import com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.exceptions.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {

    private static final Map<String, String> users = new HashMap<>();

    public static boolean userRegistration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.contains(" ")) {
            throw new WrongLoginException("Attention!!! User: [" + login + "]. Incorrect login: [" + login + "] Login contains space");
        } else if (login.length() >= 20) {
            throw new WrongPasswordException("Attention!!! User: [" + login + "]. Incorrect login: [" + login + "] Login contains more than 19 symbols.");
        } else if (password.length() >= 20 || password.contains(" ") || !containsDigit(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Attention!!! User: [" + login + "]. Incorrect password: [" + password + "] or password doesn't equals wish confirmPassword: [" + confirmPassword + ']');
        } else {
            users.putIfAbsent(login, password);
            return true;
        }
    }

    public static void showUsers() {
        int userCounter = 1;
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println("user #" + userCounter++ + " " + entry.getKey());
        }
    }

    private static boolean containsDigit(String password) {
        char[] chars = password.toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}
