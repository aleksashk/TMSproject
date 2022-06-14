package com.gmail.aleksandrphilimonov.lesson4.homework.task4;

import static com.gmail.aleksandrphilimonov.util.UtilityClass.*;

public class MainApp {
    public static void main(String[] args) {
        String msg;
        int[] array1 = createSimpleArray();
        int[] array2 = createSimpleArray();

        printer(array1);
        printer(array2);

        int avgArray1 = findAvg(array1);
        int avgArray2 = findAvg(array2);

        if(avgArray1 == avgArray2){
            msg = "The average values for both arrays are equal.";
        }else {
            msg = avgArray1 > avgArray2 ? "Average = " + avgArray1 + " for first array more than average = " + avgArray2 + " for second array." :
                    "Average = " + avgArray1 + " for second array more than average = " + avgArray2 + " or first array." ;
        }
        printer(msg);
    }

    public static int findAvg(int[] array) {
        int result = 0;
        for (int item : array) {
            result += item;
        }
        return result;
    }
}
