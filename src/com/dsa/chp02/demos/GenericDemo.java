package com.dsa.chp02.demos;

public class GenericDemo {

    public static void main(String[] args) {
        Integer[] original = {
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        reverse(original);
    }

    public static <T> void reverse(T[] data) {
        int low = 0, high = data.length - 1;
        while (low < high) {
            T temp = data[low];
            data[low++] = data[high];
            data[high--] = temp;
        }
    }

}
