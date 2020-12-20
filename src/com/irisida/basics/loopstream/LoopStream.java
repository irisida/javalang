package com.irisida.basics.loopstream;

import java.util.stream.IntStream;

public class LoopStream {
    public static void main(String[] args) {

        /*
         * The stream behaves much like a generator in python. Its amemory efficnet way
         * to create an item factory producing each item up until large numbers whilst
         * keeping a low memory footprint.
         */

        IntStream.range(0, 5).forEach(i -> {
            System.out.println(i);
        });
    }
}
