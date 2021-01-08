package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String show(){
        return "index";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam int number1, @RequestParam int number2,String calculator, Model model){
        model.addAttribute("number1", number1);
        model.addAttribute("number2",number2);
        model.addAttribute("calculator", calculator);

        int result = 0;
        switch (calculator){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1/number2;
                break;
            default:
                break;
        }
        model.addAttribute("result", result);

        return "index";
    }

}
