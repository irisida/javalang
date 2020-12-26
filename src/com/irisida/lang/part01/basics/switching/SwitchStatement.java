package com.irisida.lang.part01.basics.switching;

public class SwitchStatement {
    public static void main(String[] args) {
        int magicNumber = 4;

        switch (magicNumber) {
            case 1:
                System.out.println("one, it's the magic number!");
                break;

            case 2:
                System.out.println("two, it's the magic number!");
                break;

            case 3:
                System.out.println("Three, it's the magic number!");
                break;
            default:
                System.out.println("There is no magic number!");
        }
    }

}
