package com.gmail.aleksandrphilimonov.lesson10.classwork.string_util_package;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class StringUtil {
    public static void printFirstTwoNumericBlocks(String string) {
        String delimiter = "-";
        String[] sArray = splitStringByDash(string);
        int firstBlock = Integer.parseInt(sArray[0]);
        int secondBlock = Integer.parseInt(sArray[2]);
        UtilityClass.print(firstBlock);
        UtilityClass.printer(delimiter);
        UtilityClass.print(secondBlock);
    }

    private static String[] splitStringByDash(String string) {
        return string.split("-");
    }

    public static void renameAllLetter(String string) {
        String delimiter = "-";
        String stringForReplace = "***";
        StringBuilder sb = new StringBuilder();
        String[] array = string.split(delimiter);
        for (String s : array) {
            if (s.length() != 3) {
                sb.append(s)
                        .append(delimiter);
            } else {
                boolean flag = true;
                char[] chars = s.toCharArray();
                for (char aChar : chars) {
                    if (!Character.isAlphabetic(aChar)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    sb.append(s);
                } else {
                    sb.append(stringForReplace)
                            .append(delimiter);
                }
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb);
    }
}
