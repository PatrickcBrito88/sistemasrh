package com.sistemasrh.sistemasrh.controller;

import com.sistemasrh.sistemasrh.domain.Diretoria;
import com.sistemasrh.sistemasrh.services.DiretoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diretoria")
public class DiretoriaResourceLeitura {

    private DiretoriaService diretoriaService;


    public DiretoriaResourceLeitura(DiretoriaService diretoriaService) {
        this.diretoriaService = diretoriaService;
    }

    @GetMapping("/busca-diretoria/{id}")
    public Diretoria buscarDiretoria(@PathVariable Integer id){
        return diretoriaService.buscar(id);
    }
}
