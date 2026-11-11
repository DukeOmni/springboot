package br.learningarea.springboot.service;

import br.learningarea.springboot.dto.PontoReturn;
import org.springframework.stereotype.Service;

@Service
public class PontoService {
    public PontoReturn serverLogic(){
        return new PontoReturn("here v3");
    }
}
