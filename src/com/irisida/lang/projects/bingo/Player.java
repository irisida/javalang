package com.irisida.lang.projects.bingo;

public class Player {
    private String name;
    private double winnings;
    private BingoCard card;

    public Player(String name) {
        this.name = name;
        this.winnings = 0.0;
        this.card = new BingoCard();
    }

    public String getName() {
        return this.name;
    }

    public double getWinnings() {
        return this.winnings;
    }

    public void setWinnings(double winnings) {
        // add the amount passed to the total
        this.winnings += winnings;
    }

    public BingoCard getCard() {
        return this.card;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + this.getName()).append("\n");
        sb.append("winnings: " + this.getWinnings()).append("\n");
        sb.append("card: " + this.getCard());

        return sb.toString();
    }
}
