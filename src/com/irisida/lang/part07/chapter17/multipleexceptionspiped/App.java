package com.irisida.lang.part07.chapter17.multipleexceptionspiped;

import com.irisida.lang.part07.chapter17.multipleexceptionspiped.exceptions.TemperatureTooHighException;
import com.irisida.lang.part07.chapter17.multipleexceptionspiped.exceptions.TemperatureTooLowException;

public class App {
    public static void main(String[] args) {
        Thermostat stat = new Thermostat();

        /*
         * In this demo we are explicitly handling each exception type in a single catch
         * using a pipe. It's not entirely wrong to think of it as the logical or.
         */

        try {
            stat.setTemperature(-40);
        } catch (TemperatureTooLowException | TemperatureTooHighException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
