package com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.exceptions;

public class WrongLoginException extends AutenticationException {
    public WrongLoginException() {
    }

    public WrongLoginException (String message) {
        super(message);
    }
}
