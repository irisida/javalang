package com.irisida.lang.part07.chapter17.multipleexceptions;

import com.irisida.lang.part07.chapter17.multipleexceptions.exceptions.TemperatureTooHighException;
import com.irisida.lang.part07.chapter17.multipleexceptions.exceptions.TemperatureTooLowException;

public class App {
    public static void main(String[] args) {
        Thermostat stat = new Thermostat();

        /*
         * In this demo we are explicitly handling each exception type. In the demo the
         * functionality of the exceptions is extremely similar so the linter is trying
         * to highlight for optimisation which we'll cover in the next demo.
         */

        try {
            stat.setTemperature(-40);
        } catch (TemperatureTooHighException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (TemperatureTooLowException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
