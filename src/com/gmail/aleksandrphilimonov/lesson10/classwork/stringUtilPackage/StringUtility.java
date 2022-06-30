package com.gmail.aleksandrphilimonov.lesson10.classwork.stringUtilPackage;

import com.gmail.aleksandrphilimonov.util.UtilityClass;

public class StringUtility {
    public static final String DASH = "-";
    public static final String SPACE = " ";
    public static final String STRING_FOR_REPLACE = "***";
    public static final String CHECK_STRING = "abc";
    public static final int NUMBER_FOR_CHECK = 555;
    public static final String CHECK_STRING1 = "1a2b";

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
        return string.split(DASH);
    }

    public static void renameAllLetter(String string) {
        StringBuilder sb = new StringBuilder();
        String[] array = splitStringByDash(string);
        for (String s : array) {
            isThreeLetters(sb, s);
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
                .append('/')
                .append(sArray[4].toLowerCase().charAt(3));
        UtilityClass.printer(sb.toString());
    }

    public static void isContainsAbc(String string) {
        String msg = "";
        String[] sArray = string.split(DASH);
        for (String value : sArray) {
            String s = value.toLowerCase();
            if (s.contains(CHECK_STRING)) {
                msg = "sequence " + s + " contains string " + CHECK_STRING + "\n";
                break;
            } else {
                msg = "sequence " + s + " don't contains string " + CHECK_STRING + "\n";
            }
        }
        UtilityClass.printer(msg);
    }

    public static void isStartWith(String string) {
        String msg;
        String checkString = String.valueOf(NUMBER_FOR_CHECK);
        if (string.startsWith(checkString)) {
            msg = "String " + string + " starts with " + checkString + "\n";
        } else {
            msg = "String " + string + " doesn't start with " + checkString + "\n";
        }
        UtilityClass.printer(msg);
    }

    public static void isEndWith(String string) {
        String msg;
        if (string.endsWith(CHECK_STRING1)) {
            msg = "String " + string + " ends with " + CHECK_STRING1 + "\n";
        } else {
            msg = "String " + string + " doesn't end with " + CHECK_STRING1 + "\n";
        }
        UtilityClass.printer(msg);
    }

    public static void theShortestWord(String string) {
        String[] sArray = splitStringByDash(string);
        int minLength = sArray[0].length();
        String resultWord = sArray[0];
        for (int i = 1; i < sArray.length; i++) {
            if (sArray[i].length() < minLength) {
                minLength = sArray[i].length();
                resultWord = sArray[i];
            }
        }
        System.out.println("word with shortest length is: " + resultWord);
    }

    public static void theLongestWord(String string) {
        String[] sArray = splitStringByDash(string);
        int maxLength = sArray[0].length();
        String resultWord = sArray[0];
        for (int i = 1; i < sArray.length; i++) {
            if (sArray[i].length() > maxLength) {
                maxLength = sArray[i].length();
                resultWord = sArray[i];
            }
        }
        System.out.println("word with longest length is: " + resultWord);
    }

    public static void showMinUniqueLettersInWord(String string) {
        String[] sArray = splitStringBySpace(string);
        int minNumberUniqueLetters = findNumbersUniqueIndex(sArray[0]);
        String resultWord = sArray[0];
        for (int i = 1; i < sArray.length; i++) {
            int number = findNumbersUniqueIndex(sArray[i]);
            if (number < minNumberUniqueLetters) {
                minNumberUniqueLetters = number;
                resultWord = sArray[i];
            }
        }
        System.out.println("a word with a minimum number of different characters: " + resultWord);
    }

    private static String[] splitStringBySpace(String string) {
        return string.split(SPACE);
    }

    private static int findNumbersUniqueIndex(String string) {
        int counterOfNumberUnique = 1;
        for (int i = 0; i < string.length(); i++) {
            if (!string.contains(string.substring(i))) {
                counterOfNumberUnique++;
            }
        }
        return counterOfNumberUnique;
    }

    public static void checkPalindromInString(String string) {
        String palindrome = "the word is palindrome";
        String notPalindrome = "the word isn't palindrome";
        String[] sArray = string.split(SPACE);
        for (String s : sArray) {
            if (isPalindrome(s)) {
                UtilityClass.printer(s + " " + palindrome + "\n");
            } else {
                UtilityClass.printer(s + " " + notPalindrome + "\n");
            }
        }
    }

    private static boolean isPalindrome(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.length() != 1 &&
                    !(s.charAt(i) == s.charAt(s.length() - i - 1))){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static void isThreeLetters(StringBuilder sb, String s) {
        if (s.length() != 3) {
            sb.append(s)
                    .append(StringUtility.DASH);
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
                sb.append(StringUtility.STRING_FOR_REPLACE)
                        .append(StringUtility.DASH);
            }
        }
    }
}