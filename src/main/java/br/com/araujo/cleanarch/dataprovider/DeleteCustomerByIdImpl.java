package br.com.araujo.cleanarch.dataprovider;

import br.com.araujo.cleanarch.core.dataprovider.IDeleteCustomerById;
import br.com.araujo.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements IDeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
