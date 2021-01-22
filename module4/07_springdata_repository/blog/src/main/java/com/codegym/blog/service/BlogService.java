package com.codegym.blog.service;

import com.codegym.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(String id);

    List<Blog> findAllBlogOfCategory(String categoryId);

    void save(Blog blog);

    void edit(Blog blog);

    void delete(String id);
}
