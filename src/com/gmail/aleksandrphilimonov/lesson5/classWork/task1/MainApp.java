package com.gmail.aleksandrphilimonov.lesson5.classWork.task1;

import java.util.Arrays;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int[][][] matrix = createThreeDimensionalMatrix();
        String msg = "enter value for enlarge every item in matrix: ";
        printer(msg);
        int value = getNumber();

        System.out.println(Arrays.deepToString(matrix));

        enlargeElementInMatrix(matrix, value);

        System.out.println(Arrays.deepToString(matrix));
    }
}
