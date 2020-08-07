package com.dsa.chp01.exercises;

public class Q15 {

    public static void main(String[] args) {
        int[] numbers = {
            1, 4, 2, 6, 3, 7, 4, 8, 5, 9, 6, 10
        };

        FindExtremaResult result = findExtrema(numbers);

        System.out.println(
            String.format(
                "The min is '%d' and the max is '%d'.", result.min, result.max
            )
        );
    }

    public static FindExtremaResult findExtrema(int[] array) {
        if (array.length == 0) {

        } else if (array.length == 1) {
            return new FindExtremaResult(array[0], array[0]);
        }

        int min = array[0], max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new FindExtremaResult(min, max);
    }

    private static class FindExtremaResult {

        // just a result class, this is fine
        public final int min;
        public final int max;

        public FindExtremaResult(int min, int max) {
            this.min = min;
            this.max = max;
        }

    }

}
