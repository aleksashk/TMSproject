package com.gmail.aleksandrphilimonov.util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UtilityClass {
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String msg = "Enter correct number: ";
        while (!checkValidValue(string)) {
            printer(msg);
            string = scanner.next();
        }
        return Integer.parseInt(string);
    }

    public static boolean checkValidValue(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void fillArray(int[] array, int bound) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) - bound / 2;
        }
    }

    public static int[] createSimpleArray() {
        String msg = "Enter size of array: ";
        UtilityClass.printer(msg);
        int arraySize = getNumber();

        msg = "Enter bound for filling array: ";
        UtilityClass.printer(msg);
        int bound = getNumber();

        int[] array = new int[arraySize];
        fillArray(array, bound);
        return array;
    }

    public static void printer(String msg) {
        System.out.print(msg);
    }

    public static void printer(int[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void printer(String[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int value = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < value) {
                i++;
            }

            while (array[j] > value) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void findAvg(int[] array) {
        int result = 0;
        for (int item : array) {
            result += item;
        }
        printer("average value from array: " + result / array.length + "\n");
    }

    public static String[] createStringRandomArray(String message) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Enter the size of the array: ";
        printer(msg);
        int arraySize = getNumber();
        String[] array = new String[arraySize];

        fillStringArray(scanner, array, message);
        return array;
    }

    public static void fillStringArray(Scanner scanner, String[] array, String msg) {
        for (int i = 0; i < array.length; i++) {
            printer(msg);
            array[i] = scanner.nextLine();
        }
    }
}
