package com.gmail.aleksandrphilimonov.lesson3.homeWork.loops.task7;

public class MainApp {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 1;
        System.out.print(0 + ", " + x + ", " + y + ", ");
        for (int count = 0; count < 11; count++) {
            x = z;
            z = x + y;
            System.out.print(z + ", ");
            y = x;
        }
    }
}
