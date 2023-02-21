package br.com.araujo.cleanarch.config;

import br.com.araujo.cleanarch.core.usecases.implementations.DeleteCustomerUseCaseImpl;
import br.com.araujo.cleanarch.core.usecases.implementations.FindCustomerByIdUseCaseImpl;
import br.com.araujo.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import br.com.araujo.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerUseCaseImpl deleteCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerById,
            DeleteCustomerByIdImpl deleteCustomerById
    ){
        return new DeleteCustomerUseCaseImpl(
                findCustomerById,
                deleteCustomerById
        );
    }
}
