package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a character: ");
        System.out.println(scanner.next().charAt(0));
        System.out.print("Input a string: ");
        System.out.println(scanner.next());
        System.out.print("Input a byte: ");
        System.out.println(scanner.nextByte());
        System.out.print("Input a short: ");
        System.out.println(scanner.nextShort());
        System.out.print("Input a int: ");
        System.out.println(scanner.nextInt());
        System.out.print("Input a long: ");
        System.out.println(scanner.nextLong());
        System.out.print("Input a float: ");
        System.out.println(scanner.nextFloat());
        System.out.print("Input a double: ");
        System.out.println(scanner.nextDouble());

        scanner.close();
    }

}
