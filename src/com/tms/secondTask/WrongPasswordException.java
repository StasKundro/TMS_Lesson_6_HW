package com.tms.secondTask;

public class WrongPasswordException extends Exception{
    WrongPasswordException(String message) {
        super(message);
    }
}
