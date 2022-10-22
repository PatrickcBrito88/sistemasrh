package com.sistemasrh.sistemasrh.api.controller;

import com.sistemasrh.sistemasrh.api.dtos.FuncionarioDto;
import com.sistemasrh.sistemasrh.api.input.FuncionarioInput;
import com.sistemasrh.sistemasrh.infrastructure.services.FuncionarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionariolResourceEscrita {

    /*
    Esta classe faz a função do mundo externo se conectar à API. Esta classe em específico serve para métodos de escrita,
    como Post, Put, Patch
     */

    private FuncionarioService funcionarioService;

    public FuncionariolResourceEscrita(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("/gravar")
    public FuncionarioDto gravarFuncionario(@RequestBody FuncionarioInput funcionarioInput){
        return funcionarioService.salvar(funcionarioInput);
    }



}
