package com.irisida.lang.part07.chapter17.multipleexceptionspiped.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TemperatureTooLowException(String message) {
        super(message);
    }
}
