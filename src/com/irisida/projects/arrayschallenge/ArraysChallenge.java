package com.irisida.projects.arrayschallenge;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysChallenge {
    public static void main(String[] args) {

        /*
         * A program to accept exactly 3 numbers input from the CLI and added to an
         * array. Then the array will be iterated and the total of the three numbers is
         * dislayed
         */

        int[] numbers = new int[3];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (count < 3) {
            System.out.print("Add a number to the array: ");
            numbers[count] = scanner.nextInt();
            count++;
        }
        scanner.close();

        // using the streams example to achieve the requirement.
        IntStream.range(0, numbers.length).forEach(i -> {
            System.out.printf("array position %d is %03d%n", i, numbers[i]);
        });
        System.out.println("total: " + Arrays.stream(numbers).sum());

        // using a traditional non-streams approach to iterating and updating the total
        int total = 0;
        for (int idx = 0; idx < numbers.length; idx++) {
            System.out.printf("array position %d is %03d%n", idx, numbers[idx]);
            total += numbers[idx];
        }
        System.out.println("total: " + total);

        // using a for each approach
        int grandTotal = 0;
        for (int num : numbers) {
            System.out.printf("number is: %d%n", num);
            grandTotal += num;
        }
        System.out.println("total: " + grandTotal);
    }
}
