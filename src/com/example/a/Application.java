package com.example.a;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int a = 1;
        while (a != 0) {
            Scanner sc = new Scanner(System.in, "Windows-1250");
            System.out.print("\na = ");
            a = sc.nextInt();
            int factorial = MathUtils.factorial(a);
            System.out.println("---------------");
            System.out.println(a + "! = " + factorial);

        }
    }
}
