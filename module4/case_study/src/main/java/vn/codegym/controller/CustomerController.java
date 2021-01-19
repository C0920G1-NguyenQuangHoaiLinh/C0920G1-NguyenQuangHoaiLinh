package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Customer;
import vn.codegym.model.CustomerType;
import vn.codegym.service.CustomerService;

@Controller
@RequestMapping({"","/customer"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"","/list"})
    public ModelAndView customerList(@PageableDefault(value = 5)Pageable pageable){
        return new ModelAndView("/customer/list","customerList",customerService.findCustomer(pageable));
    }

    @GetMapping(value = "/create")
    public ModelAndView showCreateCustomer(){
    ModelAndView modelAndView = new ModelAndView("/customer/create");
    modelAndView.addObject("customer",new Customer());
    return modelAndView;
    }

    @PostMapping(value = "/create")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("successMsg","Create customer " + customer.getCustomerName()+" success !");
        return "redirect:/customer";
    }
    @GetMapping(value = "/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("customer",customerService.findById(id));
            return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
        customerService.updateCustomer(customer);
        redirectAttributes.addFlashAttribute("successMsg","Edit customer success !");
        return "redirect:/customer";
    }

}
