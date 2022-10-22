package com.sistemasrh.sistemasrh.infrastructure.exception;

public class NegocioException extends RuntimeException{

    //Classe mais geral das exceptions. 1ª Camada de excpetion da nossa api
    private static final long serialVersionUID = 1L;

    public NegocioException (String mensagem){
        super(mensagem);
    }

    public NegocioException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}
