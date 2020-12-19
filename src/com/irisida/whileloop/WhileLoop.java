package com.irisida.whileloop;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 25;

        while (count > 0) {
            /*
             * using the increment and decrement prefix/postfix operators is a more memory
             * efficient operation than a temporary variable holding values to be
             * reassigned.
             */
            System.out.printf("countdown: %d\n", count);
            --count;
        }
    }
}
