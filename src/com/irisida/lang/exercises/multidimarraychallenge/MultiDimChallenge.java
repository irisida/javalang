package com.irisida.lang.exercises.multidimarraychallenge;

public class MultiDimChallenge {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int linetotal = 0;
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%s \t", nums[i][j]);
                total += nums[i][j];
                linetotal += nums[i][j];
            }
            System.out.println("Line total is: " + linetotal);
        }
        System.out.println("total is: " + total);
    }
}
