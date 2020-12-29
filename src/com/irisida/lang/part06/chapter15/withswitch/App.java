package com.irisida.lang.part06.chapter15.withswitch;

public class App {
    public static void main(String[] args) {
        Fruits fruit = Fruits.LIME;

        switch (fruit) {
            case ORANGE:
                System.out.println("It's an orange");
                break;
            case APPLE:
                System.out.println("It's an apple");
                break;
            case LIME:
                System.out.println("Yay, Lime's are the best!");
                break;
            case PEAR:
                System.out.println("Pear's are pretty good!");
                break;
            default:
                System.out.println("It's fruit and fruit is good for you!");
        }
    }
}
