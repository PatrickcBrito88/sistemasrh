package com.sistemasrh.sistemasrh.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    /*
    Esta classe serve para configurar uma instância de modelMapper. Anotando com @Configuration eu informo ao Spring que esta
    classe servirá para configurar alguma instância de algum objeto (biblioteca).
    Quando eu utilizo o @Bean eu crio uma instância automaticamente em tempo de execução.
     */
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

}
