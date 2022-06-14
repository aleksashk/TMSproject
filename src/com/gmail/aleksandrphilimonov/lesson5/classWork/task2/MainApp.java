package com.gmail.aleksandrphilimonov.lesson5.classWork.task2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[][] chessDesk = new String[8][8];
        int counter = 0;
        for (int i = 0; i < chessDesk.length; i++, counter++) {
            for (int j = 0; j < chessDesk[i].length; j++, counter++) {
                if (counter % 2 == 0) {
                    chessDesk[i][j] = "W";
                }else {
                    chessDesk[i][j] = "B";
                }
            }
            System.out.println(Arrays.toString(chessDesk[i]));
        }
    }
}
