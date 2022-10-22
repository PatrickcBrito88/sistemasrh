package com.sistemasrh.sistemasrh.api.assembler;

import com.sistemasrh.sistemasrh.api.input.UnidadeOrganizacionalInput;
import com.sistemasrh.sistemasrh.infrastructure.domain.UnidadeOrganizacional;
import com.sistemasrh.sistemasrh.api.dtos.UnidadeOrganizacionalDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UnidadeOrganizacionalAssembler {

    /*Esta classe utiliza as funções da biblioteca do modelMapper para transformar uma instâcia de um objeto
     * diretoria em um objeto diretoriaDto
     */

    private ModelMapper modelMapper;

    public UnidadeOrganizacionalAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UnidadeOrganizacionalDto toObjectModelDto (UnidadeOrganizacional unidadeOrganizacional){
        return modelMapper.map(unidadeOrganizacional, UnidadeOrganizacionalDto.class);
    }

    public UnidadeOrganizacional toObjectModel (UnidadeOrganizacionalInput unidadeOrganizacionalInput){
        return modelMapper.map(unidadeOrganizacionalInput, UnidadeOrganizacional.class);
    }
}
