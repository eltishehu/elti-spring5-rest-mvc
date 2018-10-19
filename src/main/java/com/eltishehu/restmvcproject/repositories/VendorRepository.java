package com.eltishehu.restmvcproject.repositories;

import com.eltishehu.restmvcproject.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by e.sh. on 19-Oct-18
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
