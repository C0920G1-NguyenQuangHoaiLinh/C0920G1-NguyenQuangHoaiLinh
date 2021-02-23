package com.codegym.service;

import com.codegym.entity.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Page<Product> findByPrice(Double price, Pageable pageable) {
        return productRepository.findByPrice(price, pageable);
    }

    @Override
    public Page<Product> findByProductType(String typeName, Pageable pageable) {
        return productRepository.findByProductType(typeName, pageable);
    }

    @Override
    public Page<Product> findByPriceAndType(Double price, String typeName, Pageable pageable) {
        return productRepository.findByPriceAndProductType(price, typeName, pageable);
    }
}
