package br.learningarea.springboot.controller;

import br.learningarea.springboot.dto.PontoResponse;
import br.learningarea.springboot.service.PontoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ponto")
public class PontoController {

    private final PontoService pontoService;

    PontoController(PontoService pontoService){
        this.pontoService = pontoService;
    }

    @GetMapping()
    public String getPonto() {
        return "here";
    }

    @GetMapping(version = "2.0")
    public String getPontoV2() {
        return "here is v2";
    }

    @GetMapping(version = "3.0")
    public ResponseEntity<PontoResponse> getPontoV3() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.pontoService.serverLogic());
    }

}
