package br.learningarea.springboot.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PontoServiceTest {
    @Test
    void firstTest(){
        String expected = "Evinhas";
        assertEquals(expected, new PontoService().teste2());
    }

    @Disabled
    @Test
    void testWithMessage(){
        String expected = "Evihas";
        assertEquals(expected, new PontoService().teste2(),"Errou a evinhas");
    }
    @Disabled
    @Test
    void testWithMessageSuplier(){
        String expected = "Evihas";
        var ERROR = "ERRO123-";
        assertEquals(expected, new PontoService().teste2(),()-> new StringBuffer(ERROR).append("Errou a evinhas").toString());
    }

    @Disabled
    @Test
    void testThrowsException(){
        assertThrows(ArithmeticException.class,()->new PontoService().teste3(), "Dint throw exeption");
    }

    @Test
    void testTimeout(){
        PontoService pontoService = new PontoService();
        assertTimeout(Duration.ofMillis(1), pontoService::teste2);
    }
}
