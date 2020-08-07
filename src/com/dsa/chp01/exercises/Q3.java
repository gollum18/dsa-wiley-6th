package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a multiple: ");
        long first = scanner.nextLong();
        System.out.print("input a number: ");
        long second = scanner.nextLong();
        scanner.close();

        if (isMultiple(first, second)) {
            System.out.println(String.format("%d is a multiple of %d", first, second));
        } else {
            System.out.println(String.format("%d is not a multiple of %d", first, second));
        }
    }

    public static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }

}
