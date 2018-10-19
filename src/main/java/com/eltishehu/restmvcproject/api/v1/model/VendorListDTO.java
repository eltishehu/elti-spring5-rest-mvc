package com.eltishehu.restmvcproject.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by e.sh. on 19-Oct-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {

    List<VendorDTO> vendors;

}
