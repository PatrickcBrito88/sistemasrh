package com.sistemasrh.sistemasrh.infrastructure.domain;

import com.sistemasrh.sistemasrh.infrastructure.Enums.ETipoUnidade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UnidadeOrganizacional {
  /*
    Classes Dtos são classes que representam as informações que serão exibidas para o usuário
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sigla;
    private String senha;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "lotacao")
    private List<Funcionario> listaFuncionarios = new java.util.ArrayList<>();
    private ETipoUnidade tipoUnidade;
    private String email;

}
