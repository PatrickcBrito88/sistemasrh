package com.sistemasrh.sistemasrh.exception;

public class DiretoriaNaoEncontradaException extends EntidadeNaoEncontradaException{

    private static final long serialVersionUID = 1L;

    public DiretoriaNaoEncontradaException (String mensagem){
        super(mensagem);
    }

    public DiretoriaNaoEncontradaException(Integer id){
        this(String.format("Não existe diretoria com o id %d", id));
    }
}
