package com.sistemasrh.sistemasrh.api.input;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ETipoUnidade;
import com.sistemasrh.sistemasrh.infrastructure.domain.Funcionario;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UnidadeOrganizacionalInput {

    //Classe que representa os dados que serão informados pelo usuário

    private String nome;
    private String sigla;
    private String senha;
    private List<Funcionario> listaFuncionarios = new java.util.ArrayList<>();
    private ETipoUnidade tipoUnidade;
    private String email;
}
