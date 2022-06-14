package com.gmail.aleksandrphilimonov.lesson4.homework.task2;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        String msg = "Enter number: ";
        printer(msg);
        int number = getNumber();

        int[] array = createSimpleArray();
        printer(array);

        deleteNumberFromArray(array, number);

        printer(array);
    }

    private static void deleteNumberFromArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = 0;
            }
        }
    }
}
