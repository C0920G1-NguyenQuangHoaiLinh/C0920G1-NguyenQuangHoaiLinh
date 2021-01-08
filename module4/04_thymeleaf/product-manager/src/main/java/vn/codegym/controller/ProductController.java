package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Product;
import vn.codegym.service.ProductService;
import vn.codegym.service.ProductServiceImpl;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping({"","/index"})
    public String index(Model model, RedirectAttributes attributes){
        model.addAttribute("products",productService.findAll());
        attributes.addFlashAttribute("success","");
        return "index";
    }

    @GetMapping("product/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String save(Product product) {
        product.setIdProduct((int)(Math.random() * 10000));
        productService.save(product);
        return "redirect:/";
    }
}
