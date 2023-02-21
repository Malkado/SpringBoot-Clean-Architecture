package br.com.araujo.cleanarch.dataprovider;

import br.com.araujo.cleanarch.core.dataprovider.IFindCustomerById;
import br.com.araujo.cleanarch.core.domain.Customer;
import br.com.araujo.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.araujo.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class FindCustomerByIdImpl implements IFindCustomerById {
   @Autowired
   private CustomerRepository customerRepository;

   @Autowired
   private CustomerEntityMapper customerEntityMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity->customerEntityMapper.toCustomer(entity));
    }
}
