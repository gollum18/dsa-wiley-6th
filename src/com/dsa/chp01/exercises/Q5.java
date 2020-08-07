package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        System.out.println("The sum of all integers to " + n + " is " + sumToInt(n));
    }

    public static int sumToInt(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

}
