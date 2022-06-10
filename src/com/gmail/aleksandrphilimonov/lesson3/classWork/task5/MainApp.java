package com.gmail.aleksandrphilimonov.lesson3.classWork.task5;

import java.util.Arrays;
import java.util.Random;

//сортировка вставкой
public class MainApp {
    public static void main(String[] args) {
        int[] array = getRandArray();
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(array));
    }

    private static int[] getRandArray() {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        return array;
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
