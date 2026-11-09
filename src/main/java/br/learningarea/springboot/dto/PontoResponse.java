package br.learningarea.springboot.dto;

sealed interface PontoResponse permits PontoError,PontoPut,PontoReturn{
}
