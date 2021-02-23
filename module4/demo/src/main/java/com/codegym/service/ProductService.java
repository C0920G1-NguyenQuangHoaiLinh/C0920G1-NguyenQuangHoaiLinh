package com.codegym.service;

import com.codegym.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    Product findByName(String name);

    void saveProduct(Product product);

    void deleteProduct(Product product);

    Page<Product> findByPrice(Double price, Pageable pageable);

    Page<Product> findByProductType(String typeName, Pageable pageable);

    Page<Product> findByPriceAndType(Double price, String typeName, Pageable pageable);

}
