package com.designpatterns.solid.exception;

public class ValidatePromotionException extends RuntimeException {

    public ValidatePromotionException(String message) {
        super(message);
    }
}
