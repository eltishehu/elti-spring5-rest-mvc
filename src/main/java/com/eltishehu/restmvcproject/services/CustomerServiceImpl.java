package com.eltishehu.restmvcproject.services;

import com.eltishehu.restmvcproject.api.v1.mapper.CustomerMapper;
import com.eltishehu.restmvcproject.api.v1.model.CustomerDTO;
import com.eltishehu.restmvcproject.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by e.sh. on 18-Oct-18
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        return customerRepository
                .findAll()
                .stream()
                .map(customer -> {

                    CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
                    customerDTO.setCustomerUrl("/api/v1/customers/" + customer.getId());
                    return customerDTO;

                })
                .collect(Collectors.toList());

    }

    @Override
    public CustomerDTO getCustomerById(Long id) {

        return customerRepository
                .findById(id)
                .map(customer -> {

                    CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);
                    customerDTO.setCustomerUrl("/api/v1/customers/" + customer.getId());
                    return customerDTO;

                })
                .orElseThrow(RuntimeException::new); //TODO implement better exception handling

    }
}