package com.iknow.degree_program_allocator.exceptions;

public class FileDeletionFailedException extends RuntimeException {

    private static final long serialVersionUID = 239079079079079L;

    public FileDeletionFailedException(String message) {
        super(message);
    }
}
