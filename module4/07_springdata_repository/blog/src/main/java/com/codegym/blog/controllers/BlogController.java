package com.codegym.blog.controllers;

import com.codegym.blog.entity.Blog;
import com.codegym.blog.service.BlogService;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"", "/blog"})
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String home(Model model, RedirectAttributes redirectAttributes, @PageableDefault(value = 5)Pageable pageable) {
        redirectAttributes.addFlashAttribute("message", "");
        model.addAttribute("blogList", blogService.findAll(pageable));
        return "blog/home";
    }

    @GetMapping("/blog-category")
    public String blogOfCategory(Model model,@RequestParam Integer id){
        model.addAttribute("blogList",blogService.findAllBlogOfCategory(id));
        return "blog/blog-category";
    }

    @GetMapping("/create")
    public String showCreate(Model model,Pageable pageable) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList",categoryService.findAll(pageable));
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        try {
            this.blogService.save(blog);
            redirectAttributes.addFlashAttribute("message", "Create Complete !");
        } catch (RuntimeException e) {
            redirectAttributes.addFlashAttribute("message", "Create Failed !");
        }
        return "redirect:/";
    }

    @GetMapping("/detail")
    public String viewBlog(@RequestParam Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/detail";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam Integer id, Model model,Pageable pageable) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categoryList",categoryService.findAll(pageable));
        return "blog/edit";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.blogService.edit(blog);
        redirectAttributes.addFlashAttribute("message", "Update Complete !");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String showDelete(@RequestParam Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/delete";
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        this.blogService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Delete Complete !");
        return "redirect:/";
    }
}
