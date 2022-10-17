package com.sistemasrh.sistemasrh.repository;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.domain.UnitOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretoriaRepository extends JpaRepository<UnitOrg, Integer> {

    // Interface que representa as funções no banco de dados

}
