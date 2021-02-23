package com.codegym.controller;

import com.codegym.entity.Question;
import com.codegym.entity.QuestionType;
import com.codegym.service.QuestionServiceImpl;
import com.codegym.service.QuestionTypeServiceImpl;
import com.codegym.service.UserServiceImpl;
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
@RequestMapping("")
public class QuestionController {
    @Autowired
    QuestionServiceImpl questionService;

    @Autowired
    QuestionTypeServiceImpl questionTypeService;

    @Autowired
    UserServiceImpl userService;

    @GetMapping("")
    public ModelAndView listQuestion(@PageableDefault(size = 5)Pageable pageable,
                                     @RequestParam(value = "title",defaultValue = "")String title,
                                     @RequestParam(value = "questionType",defaultValue = "")QuestionType questionType){
        Page<Question> questions = null;
        if (title.equals("")){
            questions = questionService.findAll(pageable);
        }else if (!title.equals("")){
            questions = questionService.findByTitle(title, pageable);
        }

        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("questions", questions);
        modelAndView.addObject("title", title);
        modelAndView.addObject("questionType",questionTypeService.findAll(pageable));
//        modelAndView.addObject("questions",new Question());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateQuestion(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("question", new Question());
        modelAndView.addObject("questionType",questionTypeService.findAll(pageable));
        modelAndView.addObject("userCreate",userService.findAll());
        modelAndView.addObject("userFeedback",userService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createQuestion(@Validated @ModelAttribute Question question, BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes, Model model,Pageable pageable){
        if (bindingResult.hasErrors()){
            model.addAttribute("questionType",questionTypeService.findAll(pageable));
            model.addAttribute("userCreate",userService.findAll());
            model.addAttribute("userFeedback",userService.findAll());
            return "/create";
        }else {
            questionService.saveQuestion(question);
            redirectAttributes.addFlashAttribute("msg","create success !");
            return "redirect:/";
        }
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Long id,Model model){
        Question question = questionService.findById(id);
        model.addAttribute("question", question);
        return "/delete";
    }

    @PostMapping("/delete")
    public String deleteQuestion(@ModelAttribute Question question, RedirectAttributes redirectAttributes){
        questionService.deleteQuestion(question);
        redirectAttributes.addFlashAttribute("msg","del success !");
        return "redirect:/";
    }
}
