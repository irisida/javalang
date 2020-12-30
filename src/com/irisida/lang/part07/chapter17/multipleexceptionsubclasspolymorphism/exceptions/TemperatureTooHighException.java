package com.irisida.lang.part07.chapter17.multipleexceptionsubclasspolymorphism.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public TemperatureTooHighException(String message) {
        super(message);
    }
}
