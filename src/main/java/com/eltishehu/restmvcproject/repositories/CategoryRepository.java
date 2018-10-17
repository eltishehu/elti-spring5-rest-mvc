package com.eltishehu.restmvcproject.repositories;

import com.eltishehu.restmvcproject.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by e.sh. on 17-Oct-18
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
