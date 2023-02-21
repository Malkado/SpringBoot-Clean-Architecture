package br.com.araujo.cleanarch.core.usecases.implementations;

import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.core.usecases.IFindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements IFindCustomerByIdUseCase {
    private final IFindCustomerById findCustomerById;
    public FindCustomerByIdUseCaseImpl(IFindCustomerById findCustomerById){
        this.findCustomerById = findCustomerById;
    }
    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
