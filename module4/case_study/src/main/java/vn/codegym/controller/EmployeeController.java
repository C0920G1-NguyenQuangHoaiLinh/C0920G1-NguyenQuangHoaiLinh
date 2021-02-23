package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Customer;
import vn.codegym.model.Employee;
import vn.codegym.service.EmployeeService;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ModelAndView employeeList(@PageableDefault(value = 5)Pageable pageable){
        Page<Employee> employee = employeeService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateEmployee(){
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createEmployee(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "employee/create";
        }else {
            employeeService.saveEmployee(employee);
            redirectAttributes.addFlashAttribute("message","Create employee success !");
            return "redirect:/employee";
        }
    }

    @GetMapping(value = "/edit/{name}")
    public String showEditForm(@PathVariable String name, Model model,Pageable pageable){
        model.addAttribute("employee",employeeService.findByNameContaining(pageable, name));
        return "/employee/edit";
    }

    @PostMapping(value = "/edit")
    public String editEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes){
        employeeService.updateEmployee(employee);
        redirectAttributes.addFlashAttribute("message","Edit employee success !");
        return "redirect:/employee";
    }

    @GetMapping(value = "/delete/{name}")
    public String showDeleteForm(@PathVariable String name, Model model, Pageable pageable){
        Page<Employee> employee = employeeService.findByNameContaining(pageable, name);
        model.addAttribute("employee", employee);
        if (employee !=null){
            return "/employee/delete";
        }else {
            return "/error.404";
        }
    }

    @PostMapping(value = "/delete")
    public String deleteEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        employeeService.deleteEmployee(employee);
        redirectAttributes.addFlashAttribute("message","Delete employee success !");
        return "redirect:/employee";
    }
}
