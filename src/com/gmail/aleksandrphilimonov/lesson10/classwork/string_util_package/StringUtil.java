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
            isThreeLetters(delimiter, stringForReplace, sb, s);
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.print(sb);
    }

    public static void showOnlyLetters(String string){
        StringBuilder sb = new StringBuilder();
        String[] sArray = string.split("-");
        sb.append(sArray[1].toLowerCase())
                .append('/')
                .append(sArray[3].toLowerCase())
                .append('/');
        sb.append(sArray[4].toLowerCase().charAt(1))
                .append("/")
                .append(sArray[4].toLowerCase().charAt(3));
        System.out.print(sb);
    }

    private static void isThreeLetters(String delimiter, String stringForReplace, StringBuilder sb, String s) {
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
}
