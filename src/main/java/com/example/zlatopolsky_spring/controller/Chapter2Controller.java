package com.example.zlatopolsky_spring.controller;

import com.example.zlatopolsky_spring.services.Chapter2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/chapter2")
public class Chapter2Controller {
    private final Chapter2Service chapter2Service;

    public Chapter2Controller(Chapter2Service chapter2Service) {
        this.chapter2Service = chapter2Service;
    }


    @GetMapping("/lesson1")
    public String getLesson1Page(){
        return "chapter2/2.1";
    }

    @PostMapping("/lesson1")
    public String getLesson1ResultPage(Model model,
                                        @RequestParam("a") Integer a,
                                        @RequestParam("x") Integer x){
        model.addAttribute("a", a);
        model.addAttribute("x", x);
        model.addAttribute("ya", chapter2Service.getLesson1aResult(x));
        model.addAttribute("yb", chapter2Service.getLesson1bResult(a));
        return "chapter2/2.1_result";
    }

    @GetMapping("/lesson2")
    public String getLesson17Page(){
        return "chapter2/2.2";
    }

    @PostMapping("/lesson2")
    public String getLesson17ResultPage(Model model, @RequestParam("a") Integer a){
        model.addAttribute("a", a);
        model.addAttribute("result", chapter2Service.getLesson2Result(a));
        return "chapter2/2.2_result";
    }
}