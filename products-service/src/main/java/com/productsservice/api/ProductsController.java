package com.productsservice.api;

import com.productsservice.dto.ProductsDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @GetMapping(path = "/get-products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductsDTO> getAllProducts(){
        ProductsDTO productsDTOOne = ProductsDTO.builder().productName("Bag").productDescription("American Tourister").build();
        ProductsDTO productsDTOTwo = ProductsDTO.builder().productName("Trimmer").productDescription("Phillips Trimmer").build();
        List<ProductsDTO> productsDTOList = new ArrayList<ProductsDTO>();
        productsDTOList.add(productsDTOOne);
        productsDTOList.add(productsDTOTwo);
        return productsDTOList;
    }
}
