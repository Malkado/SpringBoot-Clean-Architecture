package br.com.araujo.cleanarch.core.usecases.implementations;

import br.com.araujo.cleanarch.core.dataprovider.IFindAddressByZipCode;
import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.dataprovider.IUpdateCustomer;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.core.usecases.IUpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements IUpdateCustomerUseCase {
    private final IFindCustomerById findCustomerById;
    private final IFindAddressByZipCode findAddressByZipCode;

    private final IUpdateCustomer  updateCustomer;
    public UpdateCustomerUseCaseImpl(
            IFindCustomerById findCustomerById,
            IFindAddressByZipCode findAddressByZipCode,
            IUpdateCustomer updateCustomer
    ){
        this.findCustomerById = findCustomerById;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipcode) {
        findCustomerById.find(customer.getId());
        var address = findAddressByZipCode.find(zipcode);
        customer.setAddress(address);
        updateCustomer.updtate(customer);
    }
}
