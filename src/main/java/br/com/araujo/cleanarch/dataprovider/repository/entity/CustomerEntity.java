package br.com.araujo.cleanarch.dataprovider.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cursomers")
public class CustomerEntity {
    @Id
    private String id;
    private String nome;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;
}
