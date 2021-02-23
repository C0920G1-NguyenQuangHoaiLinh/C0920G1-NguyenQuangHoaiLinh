package com.codegym.service;

import com.codegym.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(Integer id);

    void save (Product product);

    void update (Product product);

    void delete (Integer id);
}
