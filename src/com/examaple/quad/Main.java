package com.examaple.quad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.print("\na = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.println("\n" + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("---------------------------------");
        calculate(a, b, c);
    }

    public static void calculate(int a, int b, int c) {
        int D = b * 2 - 4 * a * c;
        System.out.print("D = " + D);
        if (D < 0) {
            System.out.println(" ; Doesn't have solution!");
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("\nx1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
