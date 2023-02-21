package br.com.araujo.cleanarch.core.usecases.implementations;

import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.core.usecases.IFindCustomerByIdUseCase;

public class FindCustomerByUseCaseImpl implements IFindCustomerByIdUseCase {
    private final IFindCustomerById findCustomerById;
    public FindCustomerByUseCaseImpl(IFindCustomerById findCustomerById){
        this.findCustomerById = findCustomerById;
    }
    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
