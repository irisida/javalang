package com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism;

import com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism.exceptions.TemperatureOutOfRangeException;

public class App {
    public static void main(String[] args) {
        Thermostat stat = new Thermostat();

        /*
         * In this demo we are using the baseclass TemperatureOutOfRangeException
         * despite throw either the tooHigh to tooLow specific exceptions we have
         * created that extend the baseclass.
         *
         * If executed with a temp below zero we will receive the TooLow message. If
         * executed with a temp above 40 we get the tooHigh message.
         */

        try {
            stat.setTemperature(-40);
        } catch (TemperatureOutOfRangeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
