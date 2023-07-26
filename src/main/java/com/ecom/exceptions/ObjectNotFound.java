package com.ecom.exceptions;

public class ObjectNotFound extends RuntimeException {

    public ObjectNotFound(String message) {
        super(message);
    }

    public ObjectNotFound(String noValueResult, String name) {
    }

    public ObjectNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}

