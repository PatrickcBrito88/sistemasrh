package com.sistemasrh.sistemasrh.api.dtos;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ETipoUnidade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnidadeOrganizacionalFuncionarioDto {

    private Integer id;
    private String nome;
    private String sigla;
    private ETipoUnidade tipoUnidade;
    private String email;
}
