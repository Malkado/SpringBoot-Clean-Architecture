package br.com.araujo.cleanarch.entrypoint.controller.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;

}
