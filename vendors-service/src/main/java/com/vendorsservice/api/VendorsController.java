package com.vendorsservice.api;

import com.vendorsservice.dto.VendorsDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendorsController {

    @GetMapping(path = "/get-vendors", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VendorsDTO> getAllVendors(){
        VendorsDTO vendorsDTOOne = VendorsDTO.builder().vendorName("Vendor One").vendorAddress("Address One").build();
        VendorsDTO vendorsDTOTwo = VendorsDTO.builder().vendorName("Vendor Two").vendorAddress("Address Two").build();
        List<VendorsDTO> vendorsDTOList = new ArrayList<VendorsDTO>();
        vendorsDTOList.add(vendorsDTOOne);
        vendorsDTOList.add(vendorsDTOTwo);
        return vendorsDTOList;
    }
}
