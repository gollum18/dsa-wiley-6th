package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        if (isEven(number)) {
            System.out.println(String.format("The number '%d' is even.", number));
        } else {
            System.out.println(String.format("The number '%d' is not even.", number));
        }
    }

    /**
     * Determines if i is even without using *, / or %.
     * @param i The number to verify.
     * @return "true" if the number is even, "false" otherwise.
     */
    public static boolean isEven(int i) {
        return (i & 1) != 1;
    }

}
