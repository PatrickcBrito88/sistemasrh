package com.sistemasrh.sistemasrh.api.dtos;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ETipoUnidade;
import com.sistemasrh.sistemasrh.infrastructure.domain.Funcionario;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UnidadeOrganizacionalDto {

    /*
    Classes Dtos são classes que representam as informações que serão exibidas para o usuário
     */

    private Integer id;
    private String nome;
    private String sigla;
    private List<Funcionario> listaFuncionarios = new java.util.ArrayList<>();
    private ETipoUnidade tipoUnidade;
    private String email;
}
