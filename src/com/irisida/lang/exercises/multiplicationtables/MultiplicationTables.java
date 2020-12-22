package com.irisida.lang.exercises.multiplicationtables;

public class MultiplicationTables {
    public static void main(String[] args) {
        /*
         * Controller variables for how many entries per table & how many tables to
         * create.
         */
        int numEntriesPerTable = 15;
        int numTables = 15;

        int[][] tables = new int[numTables][numEntriesPerTable];

        /*
         * main loop to control the generation handles the number of tables. It depends
         * on a inner loop to control the generation of the table elements or entries.
         * As we're using index zero loops we can add to the counters to ensure we're
         * starting at 1. Note that the assignment uses a multiplication in the
         * assignment to ensure we're using the correct increments per table.
         */
        for (int i = 0; i < numTables; i++) {
            System.out.printf("table: %d\t", (i + 1));
            for (int j = 0; j < numEntriesPerTable; j++) {
                tables[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3d\t", (i + 1) * (j + 1));
            }
            System.out.println(""); // create a newline
        }
    }
}
