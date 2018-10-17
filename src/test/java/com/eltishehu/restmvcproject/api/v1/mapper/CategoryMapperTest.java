package com.eltishehu.restmvcproject.api.v1.mapper;

import com.eltishehu.restmvcproject.api.v1.model.CategoryDTO;
import com.eltishehu.restmvcproject.domain.Category;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by e.sh. on 17-Oct-18
 */
public class CategoryMapperTest {

    public static final String NAME = "Joe";
    public static final Long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), category.getId());
        assertEquals(NAME, category.getName());

    }
}