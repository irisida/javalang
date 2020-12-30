package com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism;

import com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism.exceptions.TemperatureTooHighException;
import com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism.exceptions.TemperatureTooLowException;

public class Thermostat {
    /*
     * In this demo we have removed the throws Exceptions from the methods
     * signatures. In effect we can say that we are not handling the exception here.
     * We still throw an exception with the RuntimeException class and the fact that
     * the try/catch block remains in the main is what keeps the program functioning
     * as like it did in the checked exception demo.
     */

    // celsius
    public void setTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException {

        setMachineTemperature(temperature);
        System.out.println("setting temperature to: " + temperature);
    }

    private void setMachineTemperature(double temperature)
            throws TemperatureTooLowException, TemperatureTooHighException {
        if (temperature < 0) {
            throw new TemperatureTooLowException("Temperature is below minimum threshold!");
        } else if (temperature > 38) {
            throw new TemperatureTooHighException("Temperature is above maximum threshold!");
        }
    }

}
