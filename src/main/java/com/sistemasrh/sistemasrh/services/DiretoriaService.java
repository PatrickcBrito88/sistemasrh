package com.sistemasrh.sistemasrh.services;

import com.sistemasrh.sistemasrh.assembler.DiretoriaAssembler;
import com.sistemasrh.sistemasrh.assembler.DiretoriaDtoAssembler;
import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.dtos.DiretoriaDto;
import com.sistemasrh.sistemasrh.exception.DiretoriaNaoEncontradaException;
import com.sistemasrh.sistemasrh.input.DiretoriaInput;
import com.sistemasrh.sistemasrh.repository.DiretoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoriaService {

    //Classe que representa as regras de negócio. Os métodos aqui representados serão utilizados nos controllers

    private DiretoriaRepository diretoriaReporitory;
    private DiretoriaAssembler diretoriaAssembler;
    private DiretoriaDtoAssembler diretoriaDtoAssembler;

    public DiretoriaService(DiretoriaRepository diretoriaReporitory,
                            DiretoriaAssembler diretoriaAssembler,
                            DiretoriaDtoAssembler diretoriaDtoAssembler) {
        this.diretoriaReporitory = diretoriaReporitory;
        this.diretoriaAssembler = diretoriaAssembler;
        this.diretoriaDtoAssembler = diretoriaDtoAssembler;
    }

    public DiretoriaDto salvar(DiretoriaInput diretoriaInput){
        Diretoria diretoria = diretoriaAssembler.toObjectModel(diretoriaInput);
        diretoria = diretoriaReporitory.save(diretoria);
        return diretoriaDtoAssembler.toObjectModel(diretoria);
    }

    public Diretoria buscar(Integer id){
        return diretoriaReporitory.findById(id)
                .orElseThrow(()-> new DiretoriaNaoEncontradaException(id));
    }

    public List<Diretoria> buscarTodas(){
        return diretoriaReporitory.findAll();
    }

}
