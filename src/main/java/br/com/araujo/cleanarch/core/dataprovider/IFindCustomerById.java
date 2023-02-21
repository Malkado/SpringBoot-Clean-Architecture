package br.com.araujo.cleanarch.core.dataprovider;

import br.com.araujo.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface IFindCustomerById {

    Optional<Customer> find(final String id);
}
