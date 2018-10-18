package com.eltishehu.restmvcproject.services;

import com.eltishehu.restmvcproject.api.v1.mapper.CategoryMapper;
import com.eltishehu.restmvcproject.api.v1.model.CategoryDTO;
import com.eltishehu.restmvcproject.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by e.sh. on 18-Oct-18
 */
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());

    }

    @Override
    public CategoryDTO getCategoryByName(String name) {

        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));

    }
}
