package com.gmail.aleksandrphilimonov.lesson4.homework.additionalTasks.task3;

import java.util.Arrays;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.createStringRandomArray;
import static com.gmail.aleksandrphilimonov.util.UtilityClass.printer;

public class MainApp {
    public static void main(String[] args) {
        String msg = "Fill the array with names.";
        String[] array = createStringRandomArray(msg);
        printer(array);
        Arrays.sort(array);
        printer(array);
    }
}
