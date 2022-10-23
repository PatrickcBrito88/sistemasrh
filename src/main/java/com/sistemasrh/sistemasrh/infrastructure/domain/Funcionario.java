package com.sistemasrh.sistemasrh.infrastructure.domain;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ECargos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {


    @Id
    private Integer matricula;
    private String nome;
    private String senha;
    private ECargos cargo;
    private String email;
    @ManyToOne
    @JoinColumn(name = "unidades_organizacionais_id")
    private UnidadeOrganizacional lotacao;
}