package com.gmail.aleksandrphilimonov.lesson5.classWork.additionalTasks.task3;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[][] array = createTwoDimensionalMatrix();
        printer(array);
        printMainDiagonal(array);
        printSecondDiagonal(array);
    }
}
