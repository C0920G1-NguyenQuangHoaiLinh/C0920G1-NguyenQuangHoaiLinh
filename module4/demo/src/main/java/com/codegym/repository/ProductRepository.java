package com.codegym.repository;

import com.codegym.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByPrice(Double price, Pageable pageable);

    Page<Product> findByProductType(String typeName, Pageable pageable);

    Page<Product> findByPriceAndProductType(Double price, String typeName, Pageable pageable);
}
