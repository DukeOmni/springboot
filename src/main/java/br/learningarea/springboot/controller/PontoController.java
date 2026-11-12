package br.learningarea.springboot.controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ponto")
public class PontoController {

    @GetMapping(version = "1.0")
    @ApiResponse(responseCode = "200",
            content = @Content(mediaType = "application/json;version=1.0"))
    public String getPonto() {
        return "here";
    }
    @GetMapping(version = "2.0")
    @ApiResponse(responseCode = "200",
            content = @Content(mediaType = "application/json;version=2.0"))
    public String getPontoV2() {
        return "here is v2";
    }
}
