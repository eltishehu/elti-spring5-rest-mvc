package com.eltishehu.restmvcproject.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by e.sh. on 19-Oct-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {

    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;

}
