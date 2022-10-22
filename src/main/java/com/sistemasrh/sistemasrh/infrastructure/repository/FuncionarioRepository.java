package com.sistemasrh.sistemasrh.infrastructure.repository;

import com.sistemasrh.sistemasrh.infrastructure.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {


}
