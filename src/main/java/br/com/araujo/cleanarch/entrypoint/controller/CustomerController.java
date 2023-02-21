package br.com.araujo.cleanarch.entrypoint.controller;

import br.com.araujo.cleanarch.core.usecases.ICreateCustomerUseCase;
import br.com.araujo.cleanarch.core.usecases.IDeleteCustomerByIdUseCase;
import br.com.araujo.cleanarch.core.usecases.IFindCustomerByIdUseCase;
import br.com.araujo.cleanarch.core.usecases.IUpdateCustomerUseCase;
import br.com.araujo.cleanarch.entrypoint.controller.mapper.ICustomerMapper;
import br.com.araujo.cleanarch.entrypoint.controller.requests.CustomerRequest;
import br.com.araujo.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    ICreateCustomerUseCase createCustomerUserCase;

    @Autowired
    IFindCustomerByIdUseCase findCustomerByIdUseCase;
    @Autowired
    ICustomerMapper customerMapper;

    @Autowired
    IUpdateCustomerUseCase  updateCustomerUseCase;

    @Autowired
    IDeleteCustomerByIdUseCase deleteCustomerByIdUseCase;
    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
    var customer = customerMapper.toCustomer(customerRequest);
        createCustomerUserCase.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer,customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

}
