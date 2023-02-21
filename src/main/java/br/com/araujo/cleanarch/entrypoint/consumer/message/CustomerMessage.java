package br.com.araujo.cleanarch.entrypoint.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {

    private String id;
    private String name;
    private String zipcode;
    private String cpf;
    private Boolean isValidCpf;

}
