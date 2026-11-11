package br.learningarea.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ponto")
public class PontoController {

    @GetMapping(version = "1.0")
    public String getPonto() {
        return "here";
    }


    @GetMapping(version = "1.1+")
    public String getPontoV2() {
        return "here is v2";
    }
}
