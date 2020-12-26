package com.irisida.lang.part04.usingstatic.genids;

public class Item {
    private int id;
    private String name;
    private static int count = 0;

    public Item(String name) {
        count++;
        this.name = name;
        this.id = count;
    }

    public int getId() {
        return this.id;
    }

    public static int getCountOfItems() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Item [").append("\n");
        sb.append("name = ").append(this.name);
        sb.append("id = ").append(this.id);

        return sb.toString();
    }
}
