package com.gmail.aleksandrphilimonov.lesson10.classwork.additionalTasks.task1;

import com.gmail.aleksandrphilimonov.lesson10.classwork.stringUtilPackage.StringUtility;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Enter some string: ";
//        UtilityClass.printer(msg);
//        String string = scanner.nextLine();
        String string = "faf asdf 45 sdr";

        StringUtility.theShortestWord(string);
        StringUtility.theLongestWord(string);
        StringUtility.showMinUniqueLettersInWord(string);
        StringUtility.checkPalindromeInString(string);
        StringUtility.doubleLetter(string);
    }
}