package com.dsa.chp01.exercises;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.println("The number of times " + number  + " is divisible by 2 is " + timesDivBy2(number) + ".");
    }

    public static int timesDivBy2(int n) {
        if (n < 2) {
            return 0;
        }

        int total = 0;
        do {
            n /= 2;
            total += 1;
        } while(n >= 2);

        return total;
    }

}
