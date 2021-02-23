package vn.codegym.controller;

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
import vn.codegym.model.Customer;
import vn.codegym.service.CustomerService;

@Controller
@RequestMapping({"","/customer"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"","/list"})
    public ModelAndView customerList(@PageableDefault(value = 5)Pageable pageable,
                                     @RequestParam(value = "name", defaultValue = "") String name,
                                     @RequestParam(value = "email", defaultValue = "") String email) {
        Page<Customer> customers = null;
        if (name.equals("") && email.equals("")){
            customers = customerService.findCustomer(pageable);
        }else if (!name.equals("") && email.equals("")){
            customers = customerService.findName(name, pageable);
        }else if (name.equals("") && !email.equals("")){
            customers = customerService.findEmail(email, pageable);
        }else if (!name.equals("") && !email.equals("")){
            customers = customerService.findNameAndEmail(name, email, pageable);
        }

        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers",customers);
        modelAndView.addObject("name", name);
        modelAndView.addObject("email", email);
//        return new ModelAndView("/customer/list","customerList",customerService.findCustomer(pageable));
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public ModelAndView showCreateCustomer(){
    ModelAndView modelAndView = new ModelAndView("/customer/create");
    modelAndView.addObject("customer",new Customer());
    return modelAndView;
    }

    @PostMapping(value = "/create")
    public String createCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "customer/create";
        }else {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("successMsg","Create customer " + customer.getCustomerName()+" success !");
            return "redirect:/customer";
        }

    }
    @GetMapping(value = "/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model){
        model.addAttribute("customer",customerService.findById(id));
            return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes){
        customerService.updateCustomer(customer);
        redirectAttributes.addFlashAttribute("successMsg","Edit customer success !");
        return "redirect:/customer";
    }

    @GetMapping(value = "/delete/{id}")
    public String showDeleteForm(@PathVariable String id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        if (customer !=null){
            return "/customer/delete";
        }else {
            return "/error.404";
        }
    }

    @PostMapping(value = "/delete")
    public String deleteCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.deleteByCustomer(customer);
        redirectAttributes.addFlashAttribute("successMsg","Delete customer success !");
        return "redirect:/customer";
    }

}
