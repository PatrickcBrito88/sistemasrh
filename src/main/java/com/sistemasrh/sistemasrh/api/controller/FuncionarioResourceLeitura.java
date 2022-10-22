package com.sistemasrh.sistemasrh.api.controller;

import com.sistemasrh.sistemasrh.api.dtos.FuncionarioDto;
import com.sistemasrh.sistemasrh.infrastructure.services.FuncionarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResourceLeitura {

    /*
    Esta classe faz a função do mundo externo se conectar à API. Esta classe em específico serve para métodos de leitura,
    como Get
     */
    private FuncionarioService funcionarioService;

    public FuncionarioResourceLeitura(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/{matricula}")
    public FuncionarioDto buscarFuncionario(@PathVariable Integer matricula){
        return funcionarioService.buscar(matricula);
    }
}
