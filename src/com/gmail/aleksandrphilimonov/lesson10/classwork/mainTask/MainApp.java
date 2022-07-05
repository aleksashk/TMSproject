package com.gmail.aleksandrphilimonov.lesson10.classwork.mainTask;

import com.gmail.aleksandrphilimonov.lesson10.classwork.stringUtilPackage.StringUtility;
import com.gmail.aleksandrphilimonov.lesson11.classwork.DocumentNumberDoesNotContainSequenceException;
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
            StringUtility.checkContainsAbc(string2);
            StringUtility.checkContainsAbc(string3);
        } catch (DocumentNumberDoesNotContainSequenceException e) {
            System.out.println(e.getMessage());
        }

        UtilityClass.printer(delimiter);

        StringUtility.checkStartWith(string);
        StringUtility.checkStartWith(string2);
        StringUtility.checkStartWith(string3);
        UtilityClass.printer(delimiter);

        StringUtility.isEndWith(string);
        StringUtility.isEndWith(string2);
        StringUtility.isEndWith(string3);
        UtilityClass.printer(delimiter);
    }
}
