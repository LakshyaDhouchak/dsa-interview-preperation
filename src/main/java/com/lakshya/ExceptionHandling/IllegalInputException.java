package com.lakshya.ExceptionHandling;

public class IllegalInputException extends RuntimeException {
    // define the constructor
    public IllegalInputException(String s){
        super(s);
    }
}
