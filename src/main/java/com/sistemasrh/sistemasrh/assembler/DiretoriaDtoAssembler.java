package com.sistemasrh.sistemasrh.assembler;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.dtos.DiretoriaDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiretoriaDtoAssembler {

    /*Esta classe utiliza as funções da biblioteca do modelMapper para transformar uma instâcia de um objeto
     * diretoria em um objeto diretoriaDto
     */
    @Autowired
    private ModelMapper modelMapper;

    public DiretoriaDto toObjectModel (Diretoria diretoria){
        return modelMapper.map(diretoria, DiretoriaDto.class);
    }
}
