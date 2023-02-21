package br.com.araujo.cleanarch.core.usecases;

import br.com.araujo.cleanarch.core.domain.Customer;

public interface IUpdateCustomerUseCase {
    void update(Customer customer,String zipcode);
}
