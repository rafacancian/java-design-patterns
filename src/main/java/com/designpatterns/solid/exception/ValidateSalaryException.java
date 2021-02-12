package com.designpatterns.solid.exception;

public class ValidateSalaryException extends RuntimeException {

    public ValidateSalaryException(String message) {
        super(message);
    }
}
