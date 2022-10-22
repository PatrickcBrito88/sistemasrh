package com.sistemasrh.sistemasrh.api.assembler;

import com.sistemasrh.sistemasrh.api.dtos.FuncionarioDto;
import com.sistemasrh.sistemasrh.api.input.FuncionarioInput;
import com.sistemasrh.sistemasrh.infrastructure.domain.Funcionario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioAssembler {

    private ModelMapper modelMapper;


    public FuncionarioAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Funcionario toObjectModel (FuncionarioInput funcionarioInput){
        return modelMapper.map(funcionarioInput, Funcionario.class);
    }

    public FuncionarioDto toObjectModelDto (Funcionario funcionario){
        return modelMapper.map(funcionario, FuncionarioDto.class);
    }
}
