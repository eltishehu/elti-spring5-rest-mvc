package com.eltishehu.restmvcproject.controllers.v1;

import com.eltishehu.restmvcproject.api.v1.model.CustomerDTO;
import com.eltishehu.restmvcproject.api.v1.model.CustomerListDTO;
import com.eltishehu.restmvcproject.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by e.sh. on 18-Oct-18
 */
@Controller
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;

    }

    @GetMapping
    public ResponseEntity<CustomerListDTO> getListOfCustomers() {

        return new ResponseEntity<CustomerListDTO>(
                new CustomerListDTO(customerService.getAllCustomers()), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {

        return new ResponseEntity<CustomerDTO>(customerService.getCustomerById(id), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createNewCustomer(@RequestBody CustomerDTO customerDTO) {

        return new ResponseEntity<CustomerDTO>(
                customerService.createNewCustomer(customerDTO), HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO) {

        return new ResponseEntity<CustomerDTO>(
                customerService.saveCustomerByDTO(id, customerDTO), HttpStatus.OK);

    }
}
