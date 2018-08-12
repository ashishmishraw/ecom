package com.aranyacreations.ecom.controller;

import com.aranyacreations.ecom.model.Product;
import com.aranyacreations.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired ProductService productService;

    @GetMapping(value = {"", "/"})
    public @NotNull Iterable<Product> getProducts () {
        return productService.getAllProducts();
    }


}
