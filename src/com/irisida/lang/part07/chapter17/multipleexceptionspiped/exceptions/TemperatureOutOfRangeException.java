package com.irisida.lang.part07.chapter17.multipleexceptionspiped.exceptions;

public class TemperatureOutOfRangeException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}
