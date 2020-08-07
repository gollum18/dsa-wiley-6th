package com.dsa.chp03.demos;

import com.dsa.chp03.classes.CaesarCipher;

public class CaesarDemo {

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3);
        String message = "We attack at dawn!";
        String coded = cipher.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: " + answer);
    }

}
