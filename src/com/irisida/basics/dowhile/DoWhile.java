package com.irisida.basics.dowhile;

public class DoWhile {
    public static void main(String[] args) {

        int count = 0;

        do {
            /*
             * set a condition that is already outside the cinstraints of the loop we can
             * see that even though our evaluation is falsey, that the do-while construct
             * guarantees that the loop will run at least once.
             */
            System.out.println("count: " + count);
            count--;
        } while (count > 0);
    }
}
