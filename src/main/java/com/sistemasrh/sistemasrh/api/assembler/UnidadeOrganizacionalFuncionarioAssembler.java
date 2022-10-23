package com.sistemasrh.sistemasrh.api.assembler;

import com.sistemasrh.sistemasrh.api.dtos.UnidadeOrganizacionalFuncionarioDto;
import com.sistemasrh.sistemasrh.infrastructure.domain.UnidadeOrganizacional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UnidadeOrganizacionalFuncionarioAssembler {

    private ModelMapper modelMapper;


    public UnidadeOrganizacionalFuncionarioAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UnidadeOrganizacionalFuncionarioDto toObjectModelDto(UnidadeOrganizacional unidadeOrganizacional){
        return modelMapper.map(unidadeOrganizacional, UnidadeOrganizacionalFuncionarioDto.class);
    }
}
