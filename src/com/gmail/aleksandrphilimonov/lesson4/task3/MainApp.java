package com.gmail.aleksandrphilimonov.lesson4.task3;

import java.util.Arrays;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

//Sort
public class MainApp {
    public static void main(String[] args) {
        int[] array1 = createSimpleArray();
        int[] array2 = createSimpleArray();
        int[] array3 = createSimpleArray();
        int[] array4 = createSimpleArray();


        long startBubble = System.currentTimeMillis();
        bubbleSort(array1);
        long bubbleSortTimer = System.currentTimeMillis() - startBubble;

        long startInsertion = System.currentTimeMillis();
        insertionSort(array2);
        long insertionSortTimer = System.currentTimeMillis() - startInsertion;

        long startSort = System.currentTimeMillis();
        Arrays.sort(array3);
        long sortTimer = System.currentTimeMillis() - startSort;

        long quickSort = System.currentTimeMillis();
        quickSort(array4, 0, array4.length - 1);
        long fastTimer = System.currentTimeMillis() - quickSort;


        System.out.println("Bubble sort: " + bubbleSortTimer + " ms");
        System.out.println("Insertion sort: " + insertionSortTimer + " ms");
        System.out.println("Standard sort: " + sortTimer + " ms");
        System.out.println("Fast sort: " + fastTimer + " ms");
    }
}
