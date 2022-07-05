package com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task;

public class MyClassWithStaticMethod {
    public static boolean UserVerification(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean result = true;
        if(login.length() >= 20 || login.contains(" ")){
            result = false;
            throw new WrongLoginException("Incorrect login.");
        }
        if(password.length() >= 20 || password.contains(" ") || !containsDigit(password) || !password.equals(confirmPassword)){
            result = false;
            throw new WrongPasswordException("Incorrect password.");
        }
        return result;
    }

    private static boolean containsDigit(String password) {
        char[] chars = password.toCharArray();
        for (char ch : chars) {
            if(Character.isDigit(ch)){
                return true;
            }
        }
        return false;
    }
}
