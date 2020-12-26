package com.irisida.lang.part02.arrays.moremultidim;

public class MoreMultiDim {
    public static void main(String[] args) {
        String[][] words = { { "one", "two", "three", "four" }, { "five", "six" },
                { "seven", "eight", "nine", "ten" }, };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.printf("%s \t", words[i][j]);
            }
            System.out.println("");
        }
    }
}
