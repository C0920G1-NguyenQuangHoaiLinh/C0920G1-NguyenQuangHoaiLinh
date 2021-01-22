package com.codegym.blog.service;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    Category findById(Integer id);

    void save(Category category);

    void edit(Category category);

    void delete(Integer categoryId);

}
