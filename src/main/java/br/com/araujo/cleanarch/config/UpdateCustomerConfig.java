package br.com.araujo.cleanarch.config;

import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.usecases.implementations.FindCustomerByIdUseCaseImpl;
import br.com.araujo.cleanarch.core.usecases.implementations.UpdateCustomerUseCaseImpl;
import br.com.araujo.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.araujo.cleanarch.dataprovider.FindCustomerByIdImpl;
import br.com.araujo.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByUseCaseId,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ){
        return new UpdateCustomerUseCaseImpl(
                findCustomerByUseCaseId,
                findAddressByZipCode,
                updateCustomer
        );
    }
}
