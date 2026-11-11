package br.learningarea.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("{version}/ponto")
public class PontoController {

    @GetMapping(version = "v1")
    public String getPonto() {
        return "here";
    }

    @GetMapping(version = "v2")
    public String getPontoV2() {
        return "here is v2";
    }
}
