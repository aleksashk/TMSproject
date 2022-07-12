package com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model;

import com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.entity.UserAuthentication;
import com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.exceptions.AutenticationException;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class MainApp {
    public static void main(String[] args) {
        String validLogin1 = "John";
        String validLogin2 = "Mary";
        String validLogin3 = "Sonya";
        String validLogin4 = "Rachel";
        String validPasswor1 = "Doe12345678";
        String validPasswor2 = "Mary12345678";
        String validPasswor3 = "Sonya12345678";
        String confirmPassword1 = "Doe12345678";
        String confirmPassword2 = "Mary12345678";
        String confirmPassword3 = "Sonya12345678";

        String invalidLogin = "John Doe";
        String invalidPassword1 = "Doe 1234#5678@910111213&()";
        String invalidPassword2 = " ";

        showRegistrationStatus(validLogin1, validPasswor1, confirmPassword1);
        showRegistrationStatus(validLogin2, validPasswor2, confirmPassword2);
        showRegistrationStatus(validLogin3, validPasswor3, confirmPassword3);
        showRegistrationStatus(validLogin1, invalidPassword1, confirmPassword1);
        showRegistrationStatus(invalidLogin, validPasswor1, confirmPassword1);
        showRegistrationStatus(validLogin4, validPasswor1, confirmPassword3);
        showRegistrationStatus(validLogin1, validPasswor1, confirmPassword2);
        showRegistrationStatus(validLogin1, invalidPassword2, confirmPassword2);

        UserAuthentication.showUsers();

    }

    private static void showRegistrationStatus(String login, String password, String confirmPassword) {
        try {
            UtilityClass.print("user " + login + " signUp: " + UserAuthentication.userRegistration(login, password, confirmPassword));
        } catch (AutenticationException e) {
            UtilityClass.print(e.getMessage());
        }
    }
}
