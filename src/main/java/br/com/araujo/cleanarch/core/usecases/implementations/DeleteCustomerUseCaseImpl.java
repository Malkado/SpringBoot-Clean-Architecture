package br.com.araujo.cleanarch.core.usecases.implementations;

import br.com.araujo.cleanarch.core.dataprovider.IDeleteCustomerById;
import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.usecases.IDeleteCustomerByIdUseCase;

public class DeleteCustomerUseCaseImpl implements IDeleteCustomerByIdUseCase {
    private final IFindCustomerById findCustomerById;
    private final IDeleteCustomerById deleteCustomer;
    DeleteCustomerUseCaseImpl(
            IFindCustomerById findCustomerById,
            IDeleteCustomerById deleteCustomer
    ){
        this.findCustomerById = findCustomerById;
        this.deleteCustomer = deleteCustomer;
    }
    @Override
    public void delete(String id) {
         findCustomerById.find(id);
         deleteCustomer.delete(id);
    }
}
