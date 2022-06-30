package com.gmail.aleksandrphilimonov.lesson10.classwork.additional_tasks.task1;

import com.gmail.aleksandrphilimonov.lesson10.classwork.string_util_package.StringUtil;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Enter some string: ";
//        UtilityClass.printer(msg);
//        String string = scanner.nextLine();
        String string = "fffffff asdf 45 sdr";

        StringUtil.theShortestWord(string);
        StringUtil.theLongestWord(string);
        StringUtil.showMinUniqueLettersInWord(string);
    }
}
