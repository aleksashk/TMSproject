package com.gmail.aleksandrphilimonov.lesson10.classwork.string_util_package;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

import java.util.Arrays;

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
        String[] array = splitStringByDash(string);
        for (String s : array) {
            isThreeLetters(delimiter, stringForReplace, sb, s);
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.print(sb);
    }

    public static void showOnlyLetters(String string) {
        StringBuilder sb = new StringBuilder();
        String[] sArray = splitStringByDash(string);
        sb.append(sArray[1].toLowerCase())
                .append('/')
                .append(sArray[3].toLowerCase())
                .append('/');
        sb.append(sArray[4].toLowerCase().charAt(1))
                .append("/")
                .append(sArray[4].toLowerCase().charAt(3));
        UtilityClass.printer(sb.toString());
    }

    public static void isContainsAbc(String string) {
        String checkString = "abc";
        String msg = "";
        String[] sArray = string.split("-");
        for (int i = 0; i < sArray.length; i++) {
            String s = Arrays.toString(sArray).toLowerCase();
            if (s.contains(checkString)) {
                msg = "sequence " + s + " contains string " + checkString + "\n";
                break;
            } else {
                msg = "sequence " + s + " don't contains string " + checkString + "\n";
            }
        }
        UtilityClass.printer(msg);
    }

    public static void isStartWith(String string) {
        String msg;
        int number = 555;
        String checkString = String.valueOf(number);
        if (string.startsWith(checkString)) {
            msg = "String " + string + " starts with " + checkString + "\n";
        } else {
            msg = "String " + string + " doesn't start with " + checkString + "\n";
        }
        UtilityClass.printer(msg);
    }

    public static void isEndWith(String string) {
        String msg;
        String checkString = "1a2b";
        if (string.endsWith(checkString)) {
            msg = "String " + string + " ends with " + checkString + "\n";
        } else {
            msg = "String " + string + " doesn't end with " + checkString + "\n";
        }
        UtilityClass.printer(msg);
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
