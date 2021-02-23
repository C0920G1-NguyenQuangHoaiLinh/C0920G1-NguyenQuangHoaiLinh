package com.codegym.service;

import com.codegym.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    void saveProduct(Product product);

    void deleteProduct(Product product);

    Page<Product> findByName(String name, Pageable pageable);

    Page<Product> findByPrice(Double price, Pageable pageable);

    Page<Product> findByNameAndPrice(String name,Double price,Pageable pageable);
}
