package com.devsuperior.dslist.domain.exception;

public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException() {
    }

    public RecursoNaoEncontradoException(String message) {
        super(message);
    }
}
