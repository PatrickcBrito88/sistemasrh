package com.sistemasrh.sistemasrh.infrastructure.services;

import com.sistemasrh.sistemasrh.api.assembler.UnidadeOrganizacionalAssembler;
import com.sistemasrh.sistemasrh.infrastructure.domain.UnidadeOrganizacional;
import com.sistemasrh.sistemasrh.api.dtos.UnidadeOrganizacionalDto;
import com.sistemasrh.sistemasrh.infrastructure.exception.UnidadeOrganizacionalNaoEncontradaException;
import com.sistemasrh.sistemasrh.api.input.UnidadeOrganizacionalInput;
import com.sistemasrh.sistemasrh.infrastructure.repository.UnidadeOrganizacionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeOrganizacionalService {

    //Classe que representa as regras de negócio. Os métodos aqui representados serão utilizados nos controllers

    private UnidadeOrganizacionalRepository unidadeOrganizacionalRepository;
    private UnidadeOrganizacionalAssembler unidadeOrganizacionalAssembler;

    public UnidadeOrganizacionalService(UnidadeOrganizacionalRepository unidadeOrganizacionalRepository,
                                        UnidadeOrganizacionalAssembler unidadeOrganizacionalAssembler) {
        this.unidadeOrganizacionalRepository = unidadeOrganizacionalRepository;
        this.unidadeOrganizacionalAssembler = unidadeOrganizacionalAssembler;
    }

    public UnidadeOrganizacionalDto salvar(UnidadeOrganizacionalInput unidadeOrganizacionalInput) {
        UnidadeOrganizacional unidadeOrganizacional = unidadeOrganizacionalAssembler.toObjectModel(unidadeOrganizacionalInput);
        unidadeOrganizacional = unidadeOrganizacionalRepository.save(unidadeOrganizacional);
        return unidadeOrganizacionalAssembler.toObjectModelDto(unidadeOrganizacional);
    }

    public UnidadeOrganizacionalDto buscar(Integer id) {
        UnidadeOrganizacional unidadeOrganizacional = unidadeOrganizacionalRepository.findById(id)
                .orElseThrow(() -> new UnidadeOrganizacionalNaoEncontradaException(id));
        return unidadeOrganizacionalAssembler.toObjectModelDto(unidadeOrganizacional);
    }

    public List<UnidadeOrganizacional> buscarTodas() {
        return unidadeOrganizacionalRepository.findAll();
    }

}
