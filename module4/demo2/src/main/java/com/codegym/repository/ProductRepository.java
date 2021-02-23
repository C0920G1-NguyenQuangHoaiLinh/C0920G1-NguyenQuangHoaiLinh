package com.codegym.repository;

import com.codegym.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameProduct(String name, Pageable pageable);

    Page<Product> findByPrice(Double price, Pageable pageable);

    Page<Product> findByNameProductAndPrice(String name,Double price, Pageable pageable);
}
