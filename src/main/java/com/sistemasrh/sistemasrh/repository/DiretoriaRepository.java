package com.sistemasrh.sistemasrh.repository;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretoriaRepository extends JpaRepository<Diretoria, Integer> {

    // Interface que representa as funções no banco de dados

}
