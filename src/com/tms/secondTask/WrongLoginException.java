package com.tms.secondTask;

public class WrongLoginException extends Exception {
    WrongLoginException(String message) {
        super(message);
    }
}
