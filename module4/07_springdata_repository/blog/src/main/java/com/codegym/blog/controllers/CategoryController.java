package com.codegym.blog.controllers;

import com.codegym.blog.entity.Category;
import com.codegym.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String home(Model model, RedirectAttributes redirectAttributes, @PageableDefault(value = 5)Pageable pageable){
        redirectAttributes.addFlashAttribute("message","");
        model.addAttribute("categoryList",categoryService.findAll(pageable));
        return "category/home-category";
    }

    @GetMapping("/create")
    public ModelAndView showCreateCategory(){
        ModelAndView modelAndView = new ModelAndView("category/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("category","create category success !");
        return "redirect:/category";
    }

    @GetMapping("/update")
    public String showEditCategory(@RequestParam String id, Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "category/edit";
    }

    @PostMapping("/update")
    public String updateCategory(@ModelAttribute Category category,RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("category","edit category success !");
        return "redirect:/category";
    }

    @GetMapping("/delete")
    public String showDeleteCategory(@RequestParam String id, Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "category/delete";
    }

    @PostMapping("/delete")
    public String deleteCategory(@ModelAttribute String id,RedirectAttributes redirectAttributes){
        categoryService.delete(id);
        redirectAttributes.addFlashAttribute("category","delete category success !");
        return "redirect:/category";
    }
}
