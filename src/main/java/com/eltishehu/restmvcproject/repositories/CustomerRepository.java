package com.eltishehu.restmvcproject.repositories;

import com.eltishehu.restmvcproject.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by e.sh. on 18-Oct-18
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
