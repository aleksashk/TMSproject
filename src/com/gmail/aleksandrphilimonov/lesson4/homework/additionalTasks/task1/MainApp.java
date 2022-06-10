package com.gmail.aleksandrphilimonov.lesson4.homework.additionalTasks.task1;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        int minArraySize = 5;
        int maxArraySize = 10;
        int[] array = createArray(minArraySize, maxArraySize);
        printer(array);

        int arraySize2 = countTheNumberOfEvenElementsFromTheFirstArray(array);
        int[] array2 = new int[arraySize2];

        fillArray2(array, array2);
        printer(array2);
    }

    private static void fillArray2(int[] array, int[] array2) {
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[j++] = array[i];
            }
        }
    }

    private static int countTheNumberOfEvenElementsFromTheFirstArray(int[] array) {
        int result = 0;
        for (int item : array) {
            if (item % 2 == 0) {
                ++result;
            }
        }
        return result;
    }

    private static int[] createArray(int minArraySize, int maxArraySize) {
        int[] array = createSimpleArray();
        String msg = "Incorrect array size. Enter a valid array size! " +
                "The size of the array must be greater than " +
                minArraySize +
                " and less than or equal to " +
                maxArraySize;
        while (array.length <= minArraySize || array.length > maxArraySize) {
            printer(msg);
            array = createSimpleArray();
        }
        return array;
    }
}
