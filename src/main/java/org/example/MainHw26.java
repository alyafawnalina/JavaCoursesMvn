package org.example;

import java.util.Arrays;

public class MainHw26 {

    public static double averageNum(double[] numArray){
        return Arrays.stream(numArray).sum() / numArray.length;
    }

    public static boolean isMultidimensionalArray(int[][] array) {
        boolean is = false;
        for (int[] i : array) {
            is = Arrays.stream(i).count() == Arrays.stream(array).count();
        }
        return is;
    }

}
