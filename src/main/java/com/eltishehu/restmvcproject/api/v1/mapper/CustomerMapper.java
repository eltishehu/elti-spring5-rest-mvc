package com.eltishehu.restmvcproject.api.v1.mapper;

import com.eltishehu.restmvcproject.api.v1.model.CustomerDTO;
import com.eltishehu.restmvcproject.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by e.sh. on 18-Oct-18
 */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
