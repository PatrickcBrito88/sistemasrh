package com.sistemasrh.sistemasrh.assembler;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.input.DiretoriaInput;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiretoriaAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public Diretoria toObjectModel(DiretoriaInput diretoriaInput){
        return modelMapper.map(diretoriaInput, Diretoria.class);
    }


}
