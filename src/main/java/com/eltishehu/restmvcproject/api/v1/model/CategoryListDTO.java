package com.eltishehu.restmvcproject.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by e.sh. on 18-Oct-18
 */
@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;

}
