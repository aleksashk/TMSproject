package com.gmail.aleksandrphilimonov.lesson13.homework.task2;

import com.gmail.aleksandrphilimonov.lesson13.homework.task2.model.MyQueue;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1 for add, 2 for delete and 3 to print last element");
        while (s.hasNextInt()) {
            int value = s.nextInt();
            switch (value) {
                case 1 -> myQueue.enqueue(s.nextInt());
                case 2 -> myQueue.dequeue();
                case 3 -> myQueue.printDeQueue();
                default -> System.out.println("invalid input");
            }
        }
    }
}
