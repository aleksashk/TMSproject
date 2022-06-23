package com.gmail.aleksandrphilimonov.lesson1.task1;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("loop for -> i = " + i);
        }
        int j = 0;
        while (j < 10){
            System.out.println("loop while -> j = " + j++);
        }

        int k = 0;
        do{
            System.out.println("loop do/while -> k = " + k++);
        }while (k < 10);
    }
}
