package com.dsa.chp01.exercises;

public class Q14 {

    public static void main(String[] args) {
        int[] numbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        reverseIntArray(numbers);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
    }

    public static void reverseIntArray(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int bound = array.length / 2;
        for (int i = 0; i < bound; i++) {
            int j = array.length - i - 1;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
