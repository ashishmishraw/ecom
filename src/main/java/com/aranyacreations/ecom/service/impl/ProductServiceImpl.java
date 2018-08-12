package com.aranyacreations.ecom.service.impl;

import com.aranyacreations.ecom.model.Product;
import com.aranyacreations.ecom.repository.ProductRepository;
import com.aranyacreations.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
         return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
