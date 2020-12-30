package com.irisida.lang.part07.chapter16.runtimeexceptions;

public class Thermostat {

    // celsius
    public void setTemperature(double temperature) throws Exception {

        setMachineTemperature(temperature);
        System.out.println("setting temperature to: " + temperature);
    }

    private void setMachineTemperature(double temperature) throws Exception {
        if (temperature < 0 || temperature > 38) {
            throw new Exception("Temperature out of range!");
        }
    }
}
