package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CurrencyController {

    @RequestMapping(value = "/convert", method = RequestMethod.GET)
    public String showCurrencyForm(){
        return "currency";
    }

    @RequestMapping(value = "/currency", method = RequestMethod.GET)
    public ModelAndView showCurrencyExchange(@RequestParam int usd){
        int rate = 23000;
        int vnd = usd*rate;
     return new ModelAndView("currency","vnd", vnd);
    }

}
