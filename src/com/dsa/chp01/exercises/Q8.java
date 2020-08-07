package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q8 {

    public static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(String.format("The number of vowels in '%s' is '%d'.", str, countVowels(str)));
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String copy = str.toLowerCase();
        int vowels = 0;

        for (int i = 0; i < copy.length(); i++) {
            if (VOWELS.contains(String.valueOf(copy.charAt(i)))) {
                vowels++;
            }
        }

        return vowels;
    }

}
