package com.irisida.arrays.stringarrays;

public class StringsArrays {

    public static void main(String[] args) {
        /*
         * As java is strongly typed we have to type our arrays. This means that an
         * array can only house that particilar data type.
         */

        String[] foods = { "Breads", "Rice", "Cereals", "Pasta" };
        for (int index = 0; index < foods.length; index++) {
            System.out.printf("Item %02d is: %s%n", index + 1, foods[index]);
        }

        // mutate the array
        foods[2] = "Camembert Cheese";
        for (int index = 0; index < foods.length; index++) {
            System.out.printf("Item %02d is: %s%n", index + 1, foods[index]);
        }

    }
}
