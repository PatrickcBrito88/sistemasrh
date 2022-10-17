package com.sistemasrh.sistemasrh.repository;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.domain.UnitOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOrgRepository extends JpaRepository<UnitOrg, Integer> {
    // Interface que representa as funções no banco de dados

    public String nome = null;
    public String sigla = null;
    public String senha = null;
}
