package com.sistemasrh.sistemasrh.infrastructure.repository;

import com.sistemasrh.sistemasrh.infrastructure.domain.UnidadeOrganizacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeOrganizacionalRepository extends JpaRepository<UnidadeOrganizacional, Integer> {
    // Interface que representa as funções no banco de dados

}
