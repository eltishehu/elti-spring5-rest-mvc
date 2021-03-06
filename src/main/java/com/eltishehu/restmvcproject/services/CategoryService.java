package com.eltishehu.restmvcproject.services;

import com.eltishehu.restmvcproject.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Created by e.sh. on 18-Oct-18
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);

}
