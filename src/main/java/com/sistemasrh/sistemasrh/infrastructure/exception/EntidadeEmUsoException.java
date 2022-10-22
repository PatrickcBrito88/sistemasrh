package com.sistemasrh.sistemasrh.infrastructure.exception;

public class EntidadeEmUsoException extends NegocioException {

    //Classe mais específica da nossa exception. Todas as exceptions que representem NotFound de um recurso herdarão esta classe
    private static final long serialVersionUID = 1L;

    public EntidadeEmUsoException(String mensagem) {
        super(mensagem);
    }

    public EntidadeEmUsoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
