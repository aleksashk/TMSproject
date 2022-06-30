package com.gmail.aleksandrphilimonov.lesson10.classwork;

import com.gmail.aleksandrphilimonov.lesson10.classwork.string_util_package.StringUtil;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class MainApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
        String string = "5554-dpm-2345-xyz-9r7w";
        String string2 = "1234-dpm-2345-abc-9r7w";
        String string3 = "1234-ABC-2345-ert-1a2b";
        String delimiter = "\n--------------------------------\n";
        StringUtil.printFirstTwoNumericBlocks(string);
        UtilityClass.printer(delimiter);

        StringUtil.renameAllLetter(string);
        UtilityClass.printer(delimiter);

        StringUtil.showOnlyLetters(string);
        UtilityClass.printer(delimiter);

        StringUtil.isContainsAbc(string);
        StringUtil.isContainsAbc(string2);
        StringUtil.isContainsAbc(string3);
        UtilityClass.printer(delimiter);

        StringUtil.isStartWith(string);
        StringUtil.isStartWith(string2);
        StringUtil.isStartWith(string3);
        UtilityClass.printer(delimiter);

        StringUtil.isEndWith(string);
        StringUtil.isEndWith(string2);
        StringUtil.isEndWith(string3);
        UtilityClass.printer(delimiter);
    }
}
