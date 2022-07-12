package com.gmail.aleksandrphilimonov.lesson11.classwork.additional_task.model.exceptions;

public class WrongPasswordException extends AutenticationException {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
