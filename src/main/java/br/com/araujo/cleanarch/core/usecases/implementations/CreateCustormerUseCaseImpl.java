package br.com.araujo.cleanarch.core.usecases.implementations;

import br.com.araujo.cleanarch.core.dataprovider.ICreateCustomer;
import br.com.araujo.cleanarch.core.dataprovider.IFindAddressByZipCode;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.core.usecases.ICreateCustomerUseCase;

public class CreateCustormerUseCaseImpl implements ICreateCustomerUseCase {

   private final IFindAddressByZipCode findAddressByZipCode;
    private  final ICreateCustomer createCustomer;
   public CreateCustormerUseCaseImpl(IFindAddressByZipCode findAddressByZipCode,ICreateCustomer createCustomer){
       this.findAddressByZipCode = findAddressByZipCode;
       this.createCustomer = createCustomer;
   }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        this.createCustomer.insert(customer);
    }
}
