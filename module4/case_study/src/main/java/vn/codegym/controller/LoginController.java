package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.User;
import vn.codegym.service.EmployeeServiceImpl;
import vn.codegym.service.UserDetailsServiceImpl;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("")
    public String showLogin(){
        return "/login";
    }

    @GetMapping("/register")
    public String register(Model model, Pageable pageable){
        model.addAttribute("roleList",userDetailsService.allRoles());
        model.addAttribute("employeeList",employeeService.findAll(pageable));
        model.addAttribute("newUser",new User());
        return "/register";
    }

    @PostMapping("/registerNew")
    public String registerNew(@ModelAttribute User user, @RequestParam Long roleId,
                              @RequestParam String verification, RedirectAttributes redirectAttributes) {
//        if (employeeService.testRole(user,roleId)){
//            redirectAttributes.addFlashAttribute("msg","wrong");
//            return "redirect:/login/register";
//        }else {
            String message = employeeService.saveUser(user,roleId,verification);
            redirectAttributes.addFlashAttribute("msg",message);
            if (message.contains("wrong")){
                return "redirect:/login/register";
            }
            return "redirect:/login/";
//        }
    }
}
