package com.sistemasrh.sistemasrh.api.controller;

import com.sistemasrh.sistemasrh.api.dtos.UnidadeOrganizacionalDto;
import com.sistemasrh.sistemasrh.api.input.UnidadeOrganizacionalInput;
import com.sistemasrh.sistemasrh.infrastructure.services.UnidadeOrganizacionalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidade-organizacional")
public class UnidadeOrganizacionalResourceEscrita {

    /*
    Esta classe faz a função do mundo externo se conectar à API. Esta classe em específico serve para métodos de escrita,
    como Post, Put, Patch
     */
    private UnidadeOrganizacionalService unidadeOrganizacionalService;

    public UnidadeOrganizacionalResourceEscrita(UnidadeOrganizacionalService unidadeOrganizacionalService) {
        this.unidadeOrganizacionalService = unidadeOrganizacionalService;
    }

    @PostMapping("/gravar")
    public UnidadeOrganizacionalDto gravarDiretoria(@RequestBody UnidadeOrganizacionalInput unidadeOrganizacionalInput){
        return unidadeOrganizacionalService.salvar(unidadeOrganizacionalInput);
    }



}
