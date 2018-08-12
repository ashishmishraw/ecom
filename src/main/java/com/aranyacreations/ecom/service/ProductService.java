package com.aranyacreations.ecom.service;

import com.aranyacreations.ecom.model.Product;

public interface ProductService {

    public Iterable<Product> getAllProducts();

    public Product getProduct(long id);

    public Product save(Product product);

}
