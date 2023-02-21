package br.com.araujo.cleanarch.config;

import br.com.araujo.cleanarch.core.usecases.implementations.FindCustomerByIdUseCaseImpl;
import br.com.araujo.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
