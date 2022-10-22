package com.sistemasrh.sistemasrh.infrastructure.Enums;

public enum ECargos {

    GERENTE(1, "Gerente"),
    CHEFE(2, "Chefe"),
    DIRETOR(3, "Diretor"),
    CHEFE_GABINETE(4, "Chefe de Gabinete"),
    ASSESSOR_IMPRENSA(5, "Assessor de Imprensa"),
    ASSESSOR_PRESIDENCIA(6, "Assessor da Presidência"),
    ENCARREGADO(7, "Encarregado"),
    FUNCIONARIO(8, "Funcionário");

    private final Integer id;
    private final String nome;

    ECargos(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
