package br.learningarea.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class PontoService {

    public String teste2(){
        return "Evinhas";
    }
    public String teste3(){
        throw new IllegalArgumentException("This is just a exception throw");
    }

}
