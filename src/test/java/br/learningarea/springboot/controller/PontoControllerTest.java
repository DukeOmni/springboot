package br.learningarea.springboot.controller;

import br.learningarea.springboot.service.PontoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PontoControllerTest {
    @Mock
    private PontoService pontoService;
    private AutoCloseable autoCloseable;
    private PontoController pontoController;

    @BeforeEach
    void setUp() {
        this.autoCloseable=MockitoAnnotations.openMocks(this);
        this.pontoController = new PontoController(this.pontoService);
    }

    @AfterEach
    void tearDown() throws Exception {
        this.autoCloseable.close();
    }

    @Test
    void getPonto() {
        String expected = "here";
        assertEquals(expected,pontoController.getPonto());
    }

    @Test
    void getPontoV2() {
        String expected = "here is v2";
        assertEquals(expected,pontoController.getPontoV2());
    }
}