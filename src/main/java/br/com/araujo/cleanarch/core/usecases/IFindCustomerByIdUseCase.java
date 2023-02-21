package br.com.araujo.cleanarch.core.usecases;

import br.com.araujo.cleanarch.core.domain.Customer;

public interface IFindCustomerByIdUseCase {
    Customer find(final String id);
}
