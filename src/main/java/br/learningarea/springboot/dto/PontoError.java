package br.learningarea.springboot.dto;

public record PontoError(Exception e) implements PontoResponse{
}
