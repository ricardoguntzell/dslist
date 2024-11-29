package com.devsuperior.dslist.domain.exception;

public class NegocioException extends RuntimeException{

    public NegocioException() {
    }

    public NegocioException(String message) {
        super(message);
    }
}
