package com.irisida.arrays.foreach;

public class Foreach {
    public static void main(String[] args) {

        // working array
        String[] foods = { "Cereal", "Fruit Juice", "Coffee", "Eggs", "Toast" };

        /*
         * Syntactically a very common construct in java code and is suitable for
         * iteations where you do not need to access the index. If an index is required
         * you're better off sticking to a traditional for loop as in this example we
         * are creating a new variable of the value in each iteration with no care for
         * nor access to the index position.
         */
        for (String food : foods) { // the same as saying `for each food in foods`
            System.out.println(food);
        }
    }
}
