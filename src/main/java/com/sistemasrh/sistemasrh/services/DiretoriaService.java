package com.sistemasrh.sistemasrh.services;

import com.sistemasrh.sistemasrh.assembler.DiretoriaAssembler;
import com.sistemasrh.sistemasrh.assembler.DiretoriaDtoAssembler;
import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.dtos.DiretoriaDto;
import com.sistemasrh.sistemasrh.exception.DiretoriaNaoEncontradaException;
import com.sistemasrh.sistemasrh.input.DiretoriaInput;
import com.sistemasrh.sistemasrh.repository.DiretoriaReporitory;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoriaService {


    private DiretoriaReporitory diretoriaReporitory;
    private ModelMapper modelMapper;

    private DiretoriaAssembler diretoriaAssembler;
    private DiretoriaDtoAssembler diretoriaDtoAssembler;

    public DiretoriaService(DiretoriaReporitory diretoriaReporitory, ModelMapper modelMapper, DiretoriaAssembler diretoriaAssembler, DiretoriaDtoAssembler diretoriaDtoAssembler) {
        this.diretoriaReporitory = diretoriaReporitory;
        this.modelMapper = modelMapper;
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
