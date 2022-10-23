package com.sistemasrh.sistemasrh.infrastructure.exception;

public class UnidadeOrganizacionalNaoEncontradaException extends EntidadeNaoEncontradaException{

    //Classe mais específica de exception. Esta será utilizada apenas para a Diretoria

    private static final long serialVersionUID = 1L;

    public UnidadeOrganizacionalNaoEncontradaException(String mensagem){
        super(mensagem);
    }

    public UnidadeOrganizacionalNaoEncontradaException(Integer id){
        this(String.format("Não existe diretoria com o id %d", id));
    }
}
