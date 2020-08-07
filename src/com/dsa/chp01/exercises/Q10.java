package com.dsa.chp01.exercises;

import com.dsa.chp01.classes.Flower;

public class Q10 {

    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        flowers[0] = new Flower("Rose", 8, 1.50f);
        flowers[1] = new Flower("Tulip", 4, 1.00f);
        flowers[2] = new Flower("Lily", 6, 1.25f);

        flowers[0].setName("Nightshade");
        flowers[1].setPetals(2);
        flowers[2].setPrice(3.00f);

        for (Flower flower : flowers) {
            System.out.println(
                String.format("Name: '%s', Petals: '%d', Price: '%.2f'",
                    flower.getName(), flower.getPetals(), flower.getPrice())
            );
        }
    }

}
