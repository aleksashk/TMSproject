package com.gmail.aleksandrphilimonov.lesson5.classWork.additionalTasks.task4;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[][] matrix = createTwoDimensionalMatrix();
        printer(matrix);
        sortMatrix(matrix);
        printer(matrix);
    }
}
