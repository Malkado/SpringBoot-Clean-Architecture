package br.com.araujo.cleanarch.core.usecases;

import br.com.araujo.cleanarch.core.domain.Customer;

public interface ICreateCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
