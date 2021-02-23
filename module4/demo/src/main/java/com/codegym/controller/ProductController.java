package com.codegym.controller;

import com.codegym.entity.Product;
import com.codegym.service.ProductServiceImpl;
import com.codegym.service.ProductTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping({"", "/product"})
@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @Autowired
    ProductTypeServiceImpl productTypeService;

    @GetMapping({"", "/list"})
    public ModelAndView productList(@PageableDefault(value = 5) Pageable pageable) {
        Page<Product> products = productService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("productList", products);
        modelAndView.addObject("productType", productTypeService.findAll());
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createProduct(@Validated @ModelAttribute("product") Product product, BindingResult bindingResult,
                                Pageable pageable, Model model) {
        if (bindingResult.hasErrors()) {
            Page<Product> products = productService.findAll(pageable);
            model.addAttribute("productList", products);
            model.addAttribute("productType", productTypeService.findAll());
            return "/product/list";
        } else {
            productService.saveProduct(product);
            return "redirect:/";
        }
    }

    @PostMapping("/edit")
    public String editProduct(@Validated @ModelAttribute Product product, RedirectAttributes redirectAttributes,
                              BindingResult bindingResult,
                              Pageable pageable, Model model, @PathVariable Long id) {
        model.addAttribute("product", productService.findById(id));
        if (bindingResult.hasErrors()) {
            Page<Product> products = productService.findAll(pageable);
            model.addAttribute("productList", products);
            model.addAttribute("productType", productTypeService.findAll());
            return "/product/list";
        } else {
            redirectAttributes.addFlashAttribute("message","Update Complete!");
            productService.saveProduct(product);
            return "redirect:/";
        }
    }
}
