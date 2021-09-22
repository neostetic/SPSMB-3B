package com.example.a;

public class ArrayUtils {



    public static int[] generate(int length, int min, int max) {

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = MathUtils.random(min, max);
        }

        return array;
    }

    public static void print(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }

}
