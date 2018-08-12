package com.aranyacreations.ecom.service;

import com.aranyacreations.ecom.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public Iterable<Product> getAllProducts();

    public Product getProduct(long id);

    public Product save(Product product);

}
