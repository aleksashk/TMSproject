package com.gmail.aleksandrphilimonov.lesson4.homework.task3;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[] array = createSimpleArray();

        printer(array);

        findMin(array);
        findMax(array);
        findAvg(array);
    }

    private static void findMin(int[] array) {
        int result = array[0];
        for (int item : array) {
            if (result > item) {
                result = item;
            }
        }
        printer("min value from array: " + result + "\n");
    }

    private static void findMax(int[] array) {
        int result = array[0];
        for (int item : array) {
            if (result < item) {
                result = item;
            }
        }
        printer("max value from array: " + result + "\n");
    }
}
