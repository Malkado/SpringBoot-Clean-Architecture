package br.com.araujo.cleanarch.config;

import br.com.araujo.cleanarch.core.usecases.implementations.CreateCustormerUseCaseImpl;
import br.com.araujo.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.araujo.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateCustomerConfig {
    @Bean
    public CreateCustormerUseCaseImpl createCustormerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ){
    return  new CreateCustormerUseCaseImpl(findAddressByZipCode,insertCustomer);
    }
}
