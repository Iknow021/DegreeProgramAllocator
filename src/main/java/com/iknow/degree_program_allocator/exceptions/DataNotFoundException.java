package com.iknow.degree_program_allocator.exceptions;

public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
