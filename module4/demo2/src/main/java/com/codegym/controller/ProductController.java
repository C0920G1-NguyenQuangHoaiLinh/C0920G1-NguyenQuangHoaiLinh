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

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @Autowired
    ProductTypeServiceImpl productTypeService;

    @GetMapping("")
    public ModelAndView listProduct(@PageableDefault(value = 5)Pageable pageable, @RequestParam(value = "name",defaultValue = "") String name,
                                    @RequestParam(value = "price",defaultValue = "") Double price){
        Page<Product> products = null;
        if (name.equals("") && price == null){
            products = productService.findAll(pageable);
        }else if (!name.equals("") && price ==null){
            products = productService.findByName(name, pageable);
        }else if (name.equals("")&& price != null){
            products = productService.findByPrice(price, pageable);
        }else if (!name.equals("") && price != null){
            products = productService.findByNameAndPrice(name, price, pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("products", products);
        modelAndView.addObject("name", name);
        modelAndView.addObject("price", price);
        modelAndView.addObject("productType", productTypeService.findAll());
//        modelAndView.addObject("product",new Product());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateProduct(){
        ModelAndView modelAndView =new ModelAndView("/create");
        modelAndView.addObject("product",new Product());
        modelAndView.addObject("productType",productTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createProduct(@Validated @ModelAttribute Product product, BindingResult bindingResult,
                                RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("productType",productTypeService.findAll());
            return "/create";
        }else {
            productService.saveProduct(product);
            redirectAttributes.addFlashAttribute("msg", "create product success !");
            return "redirect:/";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditProduct(@PathVariable Long id, Model model){
        model.addAttribute("product",productService.findById(id));
        model.addAttribute("productType",productTypeService.findAll());
        return "/edit";
    }

    @PostMapping("/edit")
    public String editProduct(@Validated @ModelAttribute Product product, BindingResult bindingResult
            ,RedirectAttributes redirectAttributes,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("productType",productTypeService.findAll());
            return "/edit";
        }else {
            productService.saveProduct(product);
            redirectAttributes.addFlashAttribute("msg","edit success !");
            return "redirect:/";
        }
    }

    @GetMapping("/delete/{id}")
    public String showDeleteProduct(@PathVariable Long id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "/delete";
    }

    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.deleteProduct(product);
        redirectAttributes.addFlashAttribute("msg","delete success !");
        return "redirect:/";
    }
}
