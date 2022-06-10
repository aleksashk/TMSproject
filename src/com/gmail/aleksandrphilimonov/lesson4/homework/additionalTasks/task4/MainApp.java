package com.gmail.aleksandrphilimonov.lesson4.homework.additionalTasks.task4;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[] array = createSimpleArray();
        printer(array);
        bubbleSort(array);
        printer(array);
    }
}
