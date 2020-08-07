package com.dsa.chp03.demos;

public class DeepClone2DArray {

    public static void main(String[] args) {
        int[][] numbers = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24}
        };

        int[][] numbersClone = deepClone(numbers);

        System.out.println("Original:");
        printArray(numbers);

        System.out.println("Cloned:");
        printArray(numbersClone);
    }

    public static int[][] deepClone(int[][] original) {
        int[][] backup = new int[original.length][];
        for (int k = 0; k < original.length; k++) {
            backup[k] = original[k].clone();
        }
        return backup;
    }

    public static void printArray(int[][] a) {
        for (int[] r : a) {
            for (int n : r) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}
