package com.irisida.lang.part09.chapter25.endianness;

import java.nio.ByteBuffer;

public class App {
    public static void main(String[] args) {
        /**
         * take an int and examine how it is stored by Java internally. What we can see
         * in the demo is what is known as th Big Endian format. We are storing the most
         * significant byte on our array first or earliest in the array.
         */
        int value = 0x04030201;

        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(value);

        byte[] bytes = buffer.array();

        /**
         * iterate over the bytes to console the output of the storage order.
         */
        for (var b : bytes) {
            System.out.printf("[%02x] ", b);
        }
    }
}
