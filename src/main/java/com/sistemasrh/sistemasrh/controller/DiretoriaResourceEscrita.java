package com.sistemasrh.sistemasrh.controller;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.dtos.DiretoriaDto;
import com.sistemasrh.sistemasrh.input.DiretoriaInput;
import com.sistemasrh.sistemasrh.services.DiretoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diretoria")
public class DiretoriaResourceEscrita {

    /*
    Esta classe faz a função do mundo externo se conectar à API. Esta classe em específico serve para métodos de escrita,
    como Post, Put, Patch
     */
    private DiretoriaService diretoriaService;

    public DiretoriaResourceEscrita(DiretoriaService diretoriaService) {
        this.diretoriaService = diretoriaService;
    }

    @PostMapping("/gravar-diretoria")
    public DiretoriaDto gravarDiretoria(@RequestBody DiretoriaInput diretoriaInput){
        return diretoriaService.salvar(diretoriaInput);
    }



}
