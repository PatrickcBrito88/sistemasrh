package com.sistemasrh.sistemasrh.repository;

import com.sistemasrh.sistemasrh.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

    //Classe que representa os dados que serão informados pelo usuário

    private String nome;
    private String sigla;
    private String senha;


}
