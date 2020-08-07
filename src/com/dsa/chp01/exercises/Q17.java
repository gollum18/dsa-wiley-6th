package com.dsa.chp01.exercises;

public class Q17 {

    public static void main(String[] args) {
        int[] numbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        if (hasEvenPair(numbers)) {
            System.out.println("The given array has a pair of distinct numbers that multiply to an even number.");
        } else {
            System.out.println("The given array does not have a pair of distinct numbers that multiply to an even number.");
        }
    }

    public static boolean hasEvenPair(int[] numbers) {
        for (int i = 0 ; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    continue;
                }
                if (((numbers[i] * numbers[j]) & 1) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
