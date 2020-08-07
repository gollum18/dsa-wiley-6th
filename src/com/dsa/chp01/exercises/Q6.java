package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        System.out.println("The sum of all odd integers to " + n + " is " + sumToIntOdd(n));
    }

    public static int sumToIntOdd(int n) {
        int sum = 0;
        for (int i = (n % 2 == 1 ? n : n - 1); i > 0; i-=2) {
            sum += i;
        }
        return sum;
    }

}
