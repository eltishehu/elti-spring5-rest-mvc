package com.eltishehu.restmvcproject.controllers.v1;

import com.eltishehu.restmvcproject.api.v1.model.VendorDTO;
import com.eltishehu.restmvcproject.api.v1.model.VendorListDTO;
import com.eltishehu.restmvcproject.services.VendorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by e.sh. on 19-Oct-18
 */
@Api(description = "This is my Vendor API")
@RestController
@RequestMapping(VendorController.BASE_URL)
public class VendorController {

    public static final String BASE_URL = "/api/v1/vendors";

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @ApiOperation(value = "View List of Vendors.", notes = "These are some API notes.")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public VendorListDTO getVendorList() {

        return vendorService.getAllVendors();

    }

    @ApiOperation(value = "Get Vendor by Id")
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO getVendorById(@PathVariable Long id) {

        return vendorService.getVendorById(id);

    }

    @ApiOperation(value = "Create a new Vendor")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VendorDTO createNewVendor(@RequestBody VendorDTO vendorDTO) {

        return vendorService.createNewVendor(vendorDTO);

    }

    @ApiOperation(value = "Update an existing Vendor.")
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO updateVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {

        return vendorService.saveVendorByDTO(id, vendorDTO);

    }

    @ApiOperation(value = "Update a Vendor property")
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VendorDTO patchVendor(@PathVariable Long id, @RequestBody VendorDTO vendorDTO) {

        return vendorService.saveVendorByDTO(id, vendorDTO);

    }

    @ApiOperation(value = "Delete a Vendor.")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteVendor(@PathVariable Long id) {

        vendorService.deleteVendorById(id);

    }


}
