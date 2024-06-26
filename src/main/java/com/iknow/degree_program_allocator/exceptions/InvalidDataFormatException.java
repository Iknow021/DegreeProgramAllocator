package com.iknow.degree_program_allocator.exceptions;

public class InvalidDataFormatException extends RuntimeException {
    private static final long serialVersionUID = 10L;

    public InvalidDataFormatException(String message) {
        super(message);
    }
}
