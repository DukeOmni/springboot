package br.learningarea.springboot.dto;

sealed public interface PontoResponse permits PontoError,PontoPut,PontoReturn{
}
