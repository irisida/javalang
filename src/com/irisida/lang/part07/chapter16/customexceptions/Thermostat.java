package com.irisida.lang.part07.chapter16.customexceptions;

import com.irisida.lang.part07.chapter16.customexceptions.exceptions.TemperatureOutOfRangeException;

public class Thermostat {
    /*
     * In this demo we have removed the throws Exceptions from the methods
     * signatures. In effect we can say that we are not handling the exception here.
     * We still throw an exception with the RuntimeException class and the fact that
     * the try/catch block remains in the main is what keeps the program functioning
     * as like it did in the checked exception demo.
     */

    // celsius
    public void setTemperature(double temperature) throws TemperatureOutOfRangeException {

        setMachineTemperature(temperature);
        System.out.println("setting temperature to: " + temperature);
    }

    private void setMachineTemperature(double temperature) throws TemperatureOutOfRangeException {
        if (temperature < 0 || temperature > 38) {
            throw new TemperatureOutOfRangeException("Temperature out of range!");
        }
    }
}
