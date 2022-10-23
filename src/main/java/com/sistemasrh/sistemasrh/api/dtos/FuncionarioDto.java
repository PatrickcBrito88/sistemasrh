package com.sistemasrh.sistemasrh.api.dtos;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ECargos;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioDto {

    private Integer matricula;
    private String nome;
    private ECargos cargo;
    private String email;
    private UnidadeOrganizacionalFuncionarioDto lotacao;
}
