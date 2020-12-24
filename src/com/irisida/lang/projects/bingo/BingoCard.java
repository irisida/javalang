package com.irisida.lang.projects.bingo;

import java.util.Random;

public class BingoCard {
    private Random random = new Random();
    private int cardSize = 10;
    private int[] cardNumbers;

    public BingoCard() {
        // create a card of 10 numbers
        cardNumbers = new int[cardSize];

        int count = 0;
        do {
            int number = random.nextInt(51);
            boolean matched = false;

            for (int i : cardNumbers) {
                if (number == i) {
                    matched = true;
                }
            }

            if (!matched) {
                this.cardNumbers[count] = number;
                count++;
            }

        } while (count < 10);
    }

    public void markOffNumber(int x) {
        for (int i = 0; i < this.cardNumbers.length; i++) {
            if (this.cardNumbers[i] == x) {
                this.cardNumbers[i] = -1;
            }
        }
    }

    public boolean isComplete() {
        for (int i : this.cardNumbers) {
            if (i != -1) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i : this.cardNumbers) {
            sb.append(i).append(',');
        }

        return sb.toString();
    }
}
