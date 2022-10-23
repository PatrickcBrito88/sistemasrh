package com.sistemasrh.sistemasrh.infrastructure.Enums;

public enum ETipoUnidade {

    DIRETORIA(1, "Diretoria"),
    CHEFIA_GABINETE(2, "Chefia de Gabinete"),
    DEPARTAMENTO(3, "Departamento"),
    GERENCIA(4, "Gerência"),
    ASSESSORIA(5, "Assessoria"),
    SETOR(6, "Setor");

    private Integer id;
    private String nome;

    ETipoUnidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
