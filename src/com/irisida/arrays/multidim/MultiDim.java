package com.irisida.arrays.multidim;

public class MultiDim {
    public static void main(String[] args) {
        String[][] words = { { "one", "two", "three", "four" }, { "five", "six" },
                { "seven", "eight", "nine", "ten" }, };

        for (int i = 0; i < words.length; i++) {
            String[] subArray = words[i];

            for (int j = 0; j < subArray.length; j++) {
                System.out.printf("%s \t", subArray[j]);
            }
            System.out.println("");
        }
    }
}
