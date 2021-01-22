package com.codegym.blog.service;

import com.codegym.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    List<Blog> findAllBlogOfCategory(Integer categoryId);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(Integer id);
}
