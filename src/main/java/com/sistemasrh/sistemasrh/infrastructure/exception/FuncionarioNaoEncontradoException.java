package com.sistemasrh.sistemasrh.infrastructure.exception;

public class FuncionarioNaoEncontradoException extends EntidadeNaoEncontradaException{

    //Classe mais específica de exception. Esta será utilizada apenas para a Diretoria

    private static final long serialVersionUID = 1L;

    public FuncionarioNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public FuncionarioNaoEncontradoException(Integer id){
        this(String.format("Não existe funcionário com o id %d", id));
    }
}
