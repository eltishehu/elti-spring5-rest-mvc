package com.eltishehu.restmvcproject.api.v1.mapper;

import com.eltishehu.restmvcproject.api.v1.model.VendorDTO;
import com.eltishehu.restmvcproject.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by e.sh. on 19-Oct-18
 */
@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);

}