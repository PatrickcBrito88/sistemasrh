package com.sistemasrh.sistemasrh.api.input;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ECargos;
import com.sistemasrh.sistemasrh.infrastructure.domain.UnidadeOrganizacional;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioInput {


    private Integer matricula;
    private String nome;
    private String senha;
    private ECargos cargo;
    private String email;
    private UnidadeOrganizacional lotacao;

}
