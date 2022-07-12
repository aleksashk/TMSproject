package com.gmail.aleksandrphilimonov.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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

    public static int sumOfMatrixElements(int[][] matrix) {
        int result = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                result += ints[j];
            }
        }
        return result;
    }

    public static void matrixMultiplication(int[][] firstMatrix, int[][] secondMatrix) {
        int m = firstMatrix.length;
        int n = secondMatrix[0].length;
        int o = secondMatrix.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", re[j]);
            }
            System.out.println();
        }
    }

    public static int[][] createTwoDimensionalMatrix() {
        String msg = "Enter the first size of matrix: ";
        UtilityClass.printer(msg);
        int firstMatrixSize = getNumber();

        msg = "Enter the second size of matrix: ";
        UtilityClass.printer(msg);
        int secondMatrixSize = getNumber();

        msg = "Enter bound for filling array: ";
        UtilityClass.printer(msg);
        int bound = getNumber();

        int[][] matrix = new int[firstMatrixSize][secondMatrixSize];
        fillMatrix(matrix, bound);
        return matrix;
    }

    private static void fillMatrix(int[][] matrix, int bound) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(bound) - bound / 2;
            }
        }
    }

    public static int[][][] createThreeDimensionalMatrix() {
        String msg = "enter first size for matrix: ";
        printer(msg);
        int firstSize = getNumber();

        msg = "enter second size for matrix: ";
        printer(msg);
        int secondSize = getNumber();

        msg = "enter third size for matrix: ";
        printer(msg);
        int thirdSize = getNumber();

        msg = "Enter bound for filling array: ";
        UtilityClass.printer(msg);
        int bound = getNumber();

        int[][][] matrix = new int[firstSize][secondSize][thirdSize];
        fillMatrix(matrix, bound);

        return matrix;
    }

    public static void enlargeElementInMatrix(int[][][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] += number;
                }
            }
        }
    }

    private static void fillMatrix(int[][][] matrix, int bound) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = random.nextInt(bound) - bound / 2;
                }
            }
        }
    }

    public static void printer(String msg) {
        System.out.print(msg);
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void printer(int[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void printer(int[][] matrix) {
        System.out.print(Arrays.deepToString(matrix));
        System.out.println();
    }

    public static void printer(String[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void printer(int number) {
        System.out.print(number);
        System.out.println();
    }

    public static void print(int number) {
        System.out.print(number);
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

    public static void printSecondDiagonal(int[][] array) {
        String msg;
        msg = "\nSecond diagonal: ";
        printer(msg);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length - i - 1 == j) {
                    print(array[j][i]);
                }
            }
        }
    }

    public static void printMainDiagonal(int[][] array) {
        String msg = "Main diagonal: ";
        printer(msg);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    print(array[i][j]);
                }
            }
        }
    }

    public static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j + 1; k < matrix.length; k++) {
                    swapInMatrix(matrix, i, j, k);
                }
            }
        }
    }

    public static void swapInMatrix(int[][] matrix, int i, int j, int k) {
        if (matrix[i][j] > matrix[i][k]) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][k];
            matrix[i][k] = temp;
        }
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
