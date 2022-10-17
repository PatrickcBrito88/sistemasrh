package com.sistemasrh.sistemasrh.exception;

public class DiretoriaNaoEncontradaException extends EntidadeNaoEncontradaException{

    //Classe mais específica de exception. Esta será utilizada apenas para a Diretoria

    private static final long serialVersionUID = 1L;

    public DiretoriaNaoEncontradaException (String mensagem){
        super(mensagem);
    }

    public DiretoriaNaoEncontradaException(Integer id){
        this(String.format("Não existe diretoria com o id %d", id));
    }
}
