package com.gmail.aleksandrphilimonov.lesson4.homework.additionalTasks.task2;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.createSimpleArray;
import static com.gmail.aleksandrphilimonov.util.UtilityClass.printer;

public class MainApp {
    public static void main(String[] args) {
        int[] array = createSimpleArray();
        printer(array);
        changeOddElementFromArray(array);
        printer(array);
    }

    private static void changeOddElementFromArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }
}
