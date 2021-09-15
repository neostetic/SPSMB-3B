package com.example.a;

public class MathUtils {

    public static int s(int a) {
        return a * a;
    }

    public static int v(int a) {
        return s(a) * a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int vC(int r) {
        // return (int) (a*a*3.16);
        return (int) (Math.PI * r * r);
    }

    public static int vR(int v, int r) {
        return vC(r) * v;
    }

    public static int factorial(int a) {
        int x = 1;
        for (int i = a; i > 0; i--) {
            x = x * i;
        }
        return x;
    }

    public static boolean oddOrEven(int a) {
        return a % 2 == 0;
    }

    public static boolean first(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
