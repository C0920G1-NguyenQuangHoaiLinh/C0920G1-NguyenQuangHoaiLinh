package com.codegym.blog.service.impl;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAllBlogOfCategory(Integer categoryId) {
        List<Blog> blogOfCategory = new ArrayList<>();
        List<Blog> blogList = blogRepository.findAll();
        for (Blog blog : blogList){
            if (blog.getCategory().getId() == categoryId){
                blogOfCategory.add(blog);
            }
        }
        return blogOfCategory;
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void edit(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void delete(Integer id) {
        blogRepository.deleteById(id);
    }

}
