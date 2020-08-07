package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q9 {

    public static final String PUNC = ".,;:!'\"";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(String.format("The string '%s' without punctuation is '%s'.", str, removePunc(str)));
    }

    public static String removePunc(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!PUNC.contains(String.valueOf(str.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}
