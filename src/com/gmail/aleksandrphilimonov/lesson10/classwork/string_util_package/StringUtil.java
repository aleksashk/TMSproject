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
        String[] sArray = string.split("-");
        return sArray;
    }

    public static void renameAllLetter(String string) {
        String delimiter = "-";
        String stringForReplace = "***";
        StringBuilder sb = new StringBuilder();
        String[] array = string.split(delimiter);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != 3) {
                sb.append(array[i])
                        .append(delimiter);
            } else {
                boolean flag = true;
                char[] chars = array[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (!Character.isAlphabetic(chars[j])) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    sb.append(array[i]);
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
