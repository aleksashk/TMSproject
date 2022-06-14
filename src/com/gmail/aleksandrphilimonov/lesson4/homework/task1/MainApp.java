package com.gmail.aleksandrphilimonov.lesson4.homework.task1;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[] array = createSimpleArray();

        String msg = "Enter number: ";
        printer(msg);

        int number = getNumber();

        findNumberInArray(array, number);

    }

    private static void findNumberInArray(int[] array, int number) {
        int counter = 0;
        for (int item : array) {
            if (item == number) {
                counter++;
            }
        }
        String msg = "Number in array " + counter + " times";
        printer(msg);
    }
}
