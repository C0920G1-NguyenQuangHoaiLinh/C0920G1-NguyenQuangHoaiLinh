package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {

    @GetMapping("/")
    public String show(){
        return "index";
    }

    @PostMapping("/save")
    public String save(ModelMap model, @RequestParam("condiment") String[] condiment){
        String msg = "Gia vi : ";
        model.addAttribute("msg", msg);
        model.addAttribute("condiment", condiment);

        return "index";
    }

}
