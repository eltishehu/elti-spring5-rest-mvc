package com.eltishehu.restmvcproject.api.v1.mapper;

import com.eltishehu.restmvcproject.api.v1.model.CategoryDTO;
import com.eltishehu.restmvcproject.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by e.sh. on 17-Oct-18
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
