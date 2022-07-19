package com.gmail.aleksandrphilimonov.lesson15.homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {
    static final int FROM = 7;
    static final int TO = 17;

    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            alist.add(random.nextInt(15));
        }
        String msg = "Press 0 for show arrayList;\n" +
                "Press 1 for delete duplicates;\n" +
                "Press 2 for show all elements from 7 to 17;\n" +
                "Press 3 for multiply every item to 2;\n" +
                "Press 4 for sort and show first 4 items;\n" +
                "Press 5 for show the number of items;\n" +
                "Press 6 for show average of all items;\n" +
                "Press 7 or 8 or 9 for EXIT;\n";

        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice < 7) {
            switch (choice) {
                case 0 -> showArrayList(alist);
                case 1 -> deleteDuplicates(alist);
                case 2 -> showAllElementFromTo(alist);
                case 3 -> multiplyEveryItem2(alist);
                case 4 -> sortAndShowFirst4Items(alist);
                case 5 -> showNumberOfItems(alist);
                case 6 -> showAVG(alist);
            }
            choice = scanner.nextInt();
        }
    }

    private static void showAVG(List<Integer> alist) {
        System.out.print("Average of the stream: ");
        Optional<Integer> sum = alist.stream().reduce((ac, val) -> ac + val);
        if (sum.isPresent()) {
            System.out.println(sum.get() / (double) alist.size());
        }
    }

    private static void sortAndShowFirst4Items(List<Integer> alist) {
        System.out.println("Show first 4 element of the stream after sorting: ");
        List<Integer> newLimitList = alist.stream().sorted().limit(4).collect(Collectors.toList());
        System.out.println(newLimitList);
    }

    private static void showNumberOfItems(List<Integer> alist) {
        System.out.println("Number of items in the stream: " + alist.stream().count());
    }

    private static void showAllElementFromTo(List<Integer> alist) {
        System.out.println("Every even element from " + MainApp.FROM + " to " + MainApp.TO + ": ");
        List<Integer> newIncreaseList = alist.stream().filter(e -> e % 2 == 0).filter(e -> e > MainApp.FROM && e < MainApp.TO).collect(Collectors.toList());
        showArrayList(newIncreaseList);
    }

    private static void multiplyEveryItem2(List<Integer> alist) {
        System.out.println("Stream after multiplying each element by 2: ");
        List<Integer> newIncreaseList = alist.stream().map(e -> e * 2).collect(Collectors.toList());
        showArrayList(newIncreaseList);
    }

    private static void deleteDuplicates(List<Integer> alist) {
        System.out.println("Stream after deleting duplicates: ");
        List<Integer> listWithoutDuplicates = alist.stream().distinct().collect(Collectors.toList());
        showArrayList(listWithoutDuplicates);
    }

    private static void showArrayList(List<Integer> alist) {
        System.out.print("ArrayList: ");
        System.out.println(alist);
    }
}