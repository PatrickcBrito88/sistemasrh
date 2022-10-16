package com.sistemasrh.sistemasrh.repository;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretoriaReporitory extends JpaRepository<Diretoria, Integer> {

}
