package com.example.a;

import java.util.Scanner;

public class ArrayApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.print("Input Length: ");
        int length = sc.nextInt();
        System.out.print("Input Min: ");
        int min = sc.nextInt();
        System.out.print("Input Max: ");
        int max = sc.nextInt();
        int[] array = ArrayUtils.generate(length, min, max);

        for (int j : array) {
            System.out.print(j + ", ");
        }

    }

}
