package com.irisida.lang.part02.chapter04.streamsarrays;

import java.util.stream.IntStream;

public class StreamsArrays {
    public static void main(String[] args) {

        String[] foods = { "Breads", "Salad", "Olives", "Roasted Ham", "Mustard", "Potato salad" };

        IntStream.range(0, foods.length).forEach(i -> {
            System.out.printf("Ingredient %02d is %s%n", i + 1, foods[i]);
        });

    }
}
