package com.gmail.aleksandrphilimonov.lesson10.classwork.mainTask;

import com.gmail.aleksandrphilimonov.lesson10.classwork.stringUtilPackage.StringUtility;
import com.gmail.aleksandrphilimonov.lesson11.classwork.DocumentNumberDoesNotContainSequenceException;
import com.gmail.aleksandrphilimonov.lesson11.classwork.DocumentNumberDoesNotEndWithSequenceException;
import com.gmail.aleksandrphilimonov.lesson11.classwork.DocumentNumberDoesNotStartWithSequenceException;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class MainApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
        String string = "5554-dpm-2345-xyz-9r7w";
        String string2 = "1234-dpm-2345-abc-9r7w";
        String string3 = "1234-ABC-2345-ert-1a2b";
        String delimiter = "\n--------------------------------\n";
        StringUtility.printFirstTwoNumericBlocks(string);
        UtilityClass.printer(delimiter);

        StringUtility.renameAllLetter(string);
        UtilityClass.printer(delimiter);

        StringUtility.showOnlyLetters(string);
        UtilityClass.printer(delimiter);

        try {
            StringUtility.checkContainsAbc(string);
        } catch (DocumentNumberDoesNotContainSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkContainsAbc(string2);
        } catch (DocumentNumberDoesNotContainSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkContainsAbc(string3);
        } catch (DocumentNumberDoesNotContainSequenceException e) {
            System.out.println(e.getMessage());
        }

        UtilityClass.printer(delimiter);

        try {
            StringUtility.checkStartWith(string);
        } catch (DocumentNumberDoesNotStartWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkStartWith(string2);
        } catch (DocumentNumberDoesNotStartWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkStartWith(string3);
        } catch (DocumentNumberDoesNotStartWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        UtilityClass.printer(delimiter);

        try {
            StringUtility.checkEndWith(string);
        } catch (DocumentNumberDoesNotEndWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkEndWith(string2);
        } catch (DocumentNumberDoesNotEndWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        try {
            StringUtility.checkEndWith(string3);
        } catch (DocumentNumberDoesNotEndWithSequenceException e) {
            System.out.println(e.getMessage());
        }
        UtilityClass.printer(delimiter);
    }
}
