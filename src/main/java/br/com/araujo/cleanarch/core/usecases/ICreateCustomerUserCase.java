package br.com.araujo.cleanarch.core.usecases;

import br.com.araujo.cleanarch.core.domain.Customer;

public interface ICreateCustomerUserCase {
    void insert(Customer customer, String zipCode);
}
