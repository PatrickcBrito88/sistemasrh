package com.sistemasrh.sistemasrh.infrastructure.services;

import com.sistemasrh.sistemasrh.api.assembler.FuncionarioAssembler;
import com.sistemasrh.sistemasrh.infrastructure.domain.Funcionario;
import com.sistemasrh.sistemasrh.api.dtos.FuncionarioDto;
import com.sistemasrh.sistemasrh.infrastructure.exception.FuncionarioNaoEncontradoException;
import com.sistemasrh.sistemasrh.api.input.FuncionarioInput;
import com.sistemasrh.sistemasrh.infrastructure.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;
    private FuncionarioAssembler funcionarioAssembler;

    public FuncionarioService(FuncionarioRepository funcionarioRepository,
                              FuncionarioAssembler funcionarioAssembler) {
        this.funcionarioRepository = funcionarioRepository;
        this.funcionarioAssembler = funcionarioAssembler;
    }

    public FuncionarioDto buscar (Integer id){
        Funcionario funcionario =  funcionarioRepository.findById(id)
                .orElseThrow(() -> new FuncionarioNaoEncontradoException(id));
        return funcionarioAssembler.toObjectModelDto(funcionario);
    }

    public FuncionarioDto salvar (FuncionarioInput funcionarioInput){
        Funcionario funcionario = funcionarioAssembler.toObjectModel(funcionarioInput);
        funcionario = funcionarioRepository.save(funcionario);
        return funcionarioAssembler.toObjectModelDto(funcionario);
    }




}
