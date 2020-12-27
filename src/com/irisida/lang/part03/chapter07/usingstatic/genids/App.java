package com.irisida.lang.part03.chapter07.usingstatic.genids;

public class App {
    public static void main(String[] args) {

        // checks the instance count
        System.out.println(checkMessage());

        Item item1 = new Item("macBook pro");
        Item item2 = new Item("macBook air 2020");

        // re-checks the instance count
        System.out.println(checkMessage());

        Item item3 = new Item("MS surface pro laptop 4");

        // another check of the instance count after adding another Item
        System.out.println(checkMessage());

        /*
         * fetches the IDs of the instances that were set using the static instance
         * count. So we can easily see that the ID of a Item is whatever the instance
         * count for Items was at the time it was created.
         *
         */
        System.out.println(item1.getId());
        System.out.println(item2.getId());
        System.out.println(item3.getId());
    }

    public static String checkMessage() {
        return "Item class instance count: " + Item.getCountOfItems();
    }
}
