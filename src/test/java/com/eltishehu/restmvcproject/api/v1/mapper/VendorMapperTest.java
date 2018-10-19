package com.eltishehu.restmvcproject.api.v1.mapper;

import com.eltishehu.restmvcproject.api.v1.model.VendorDTO;
import com.eltishehu.restmvcproject.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by e.sh. on 19-Oct-18
 */
public class VendorMapperTest {

    public static final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() {

        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        //then
        assertEquals(vendor.getName(), vendorDTO.getName());

    }

    @Test
    public void vendorDTOtoVendor() {

        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        //when
        Vendor vendor = vendorMapper.vendorDTOtoVendor(vendorDTO);

        //then
        assertEquals(vendorDTO.getName(), vendor.getName());

    }

}