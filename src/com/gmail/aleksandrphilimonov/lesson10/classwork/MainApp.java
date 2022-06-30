package com.gmail.aleksandrphilimonov.lesson10.classwork;

import com.gmail.aleksandrphilimonov.lesson10.classwork.string_util_package.StringUtil;
import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class MainApp {
    public static void main(String[] args) {
        String delimiter = "\n--------------------------------\n";
        String string = "1234-DPM-2345-XYZ-9R7W";
        StringUtil.printFirstTwoNumericBlocks(string);
        UtilityClass.printer(delimiter);
        StringUtil.renameAllLetter(string);
    }
}
