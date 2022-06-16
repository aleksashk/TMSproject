package com.gmail.aleksandrphilimonov.lesson5.classWork.additionalTasks.task1;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.matrixMultiplication;

public class MainApp {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        matrixMultiplication(firstMatrix, secondMatrix);
    }
}
