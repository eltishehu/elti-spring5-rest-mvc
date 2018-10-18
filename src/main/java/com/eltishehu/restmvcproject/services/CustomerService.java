package com.eltishehu.restmvcproject.services;

import com.eltishehu.restmvcproject.api.v1.model.CustomerDTO;

import java.util.List;

/**
 * Created by e.sh. on 18-Oct-18
 */
public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

    CustomerDTO saveCustomerByDTO(Long id, CustomerDTO customerDTO);

    CustomerDTO patchCustomer(Long id, CustomerDTO customerDTO);
}
