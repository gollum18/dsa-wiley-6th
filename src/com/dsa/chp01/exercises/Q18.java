package com.dsa.chp01.exercises;

public class Q18 {

    public static void main(String[] args) {
        int[] coords = {
            4, 3
        };
        System.out.println("The p-norm is " + norm(coords, 2));
    }

    public static double norm(int[] v, int p) {
        int total = 0;
        for (int n : v) {
            total += Math.pow(n, p);
        }
        if (total < 0) {
            return -Math.pow(Math.abs(total), (1.0 / p));
        }
        return Math.pow(total, 1.0 / p);
    }

}
