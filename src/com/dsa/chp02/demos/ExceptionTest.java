package com.dsa.chp02.demos;

public class ExceptionTest {

    public static final int DEFAULT = 1;

    public static void main(String[] args) {
        int n = DEFAULT;
        try {
            n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("n must be positive. Using default.");
                n = DEFAULT;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No argument specified for n. Using default.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid integer argument. Using default.");
        }
    }

}
