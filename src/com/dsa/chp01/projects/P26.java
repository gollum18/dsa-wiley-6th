package com.dsa.chp01.projects;

import java.util.Scanner;

public class P26 {

    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter lines of text. Hit Ctrl+D when done.");
        takeInput();
    }

    public static void takeInput() {
        String next = input.nextLine();
        if (input.hasNextLine()) {
            takeInput();
        }
        System.out.println(next);
    }

}
