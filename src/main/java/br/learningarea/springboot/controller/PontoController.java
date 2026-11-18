package br.learningarea.springboot.controller;

import br.learningarea.springboot.service.PontoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ponto")
public class PontoController {

    private final PontoService pontoService;

    public PontoController(PontoService pontoService) {
        this.pontoService = pontoService;
    }


    @GetMapping(version = "1.0")
    public String getPonto() {
        return "here";
    }
    @GetMapping(version = "2.0")
    public String getPontoV2() {
        pontoService.teste2();
        return "here is v2";
    }
}
