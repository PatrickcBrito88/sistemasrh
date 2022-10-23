package com.sistemasrh.sistemasrh.api.controller;

import com.sistemasrh.sistemasrh.api.dtos.UnidadeOrganizacionalDto;
import com.sistemasrh.sistemasrh.infrastructure.services.UnidadeOrganizacionalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidade-organizacional")
public class UnidadeOrganizacionalResourceLeitura {

    /*
    Esta classe faz a função do mundo externo se conectar à API. Esta classe em específico serve para métodos de leitura,
    como Get
     */
    private UnidadeOrganizacionalService unidadeOrganizacionalService;

    public UnidadeOrganizacionalResourceLeitura(UnidadeOrganizacionalService unidadeOrganizacionalService) {
        this.unidadeOrganizacionalService = unidadeOrganizacionalService;
    }

    @GetMapping("/{id}")
    public UnidadeOrganizacionalDto buscarUnidadeOrganizacional(@PathVariable Integer id){
        return unidadeOrganizacionalService.buscar(id);
    }
}
