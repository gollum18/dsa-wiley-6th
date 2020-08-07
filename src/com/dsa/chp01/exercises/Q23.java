package com.dsa.chp01.exercises;

import java.util.Arrays;

public class Q23 {

    private static final int[] ERROR = {0};

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = dot(a, b);

        for (int n : c) {
            System.out.print(n + " ");
        }
    }

    public static int[] dot(int[] a, int[] b) {
        if (a == null) {
            return ERROR;
        }

        if (b == null) {
            return ERROR;
        }

        if (a.length == 0 && b.length == 0) {
            return ERROR;
        }

        if (a.length < b.length) {
            // this should be refactored into a method
            int[] copy = Arrays.copyOf(a, b.length);
            Arrays.fill(copy, a.length, copy.length, 0);
            a = copy;
        } else if (b.length < a.length) {
            int[] copy = Arrays.copyOf(b, a.length);
            Arrays.fill(copy, b.length, copy.length, 0);
            b = copy;
        }

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }
}
