package com.example.zlatopolsky_spring.controller;

import com.example.zlatopolsky_spring.services.Chapter1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chapter1")
public class Chapter1Controller {
    private final Chapter1Service chapter1Service;

    public Chapter1Controller(Chapter1Service chapter1Service) {
        this.chapter1Service = chapter1Service;
    }

    @GetMapping("/lesson1")
    public String getLesson1Page(Model model){
        model.addAttribute("numbers", chapter1Service.getLesson1Numbers());
        return "chapter1/1.1";
    }

    @GetMapping("/lesson2")
    public String getLesson2Page(Model model){
        model.addAttribute("numbers", chapter1Service.getLesson2Numbers());
        return "chapter1/1.2";
    }

    @GetMapping("/lesson3")
    public String getLesson3Page(Model model){
        model.addAttribute("numbers", chapter1Service.getLesson3Numbers());
        return "chapter1/1.3";
    }

    @GetMapping("/lesson4")
    public String getLesson4Page(Model model){
        model.addAttribute("numbers", chapter1Service.getLesson4Numbers());
        return "chapter1/1.4";
    }

    @GetMapping("/lesson5")
    public String getLesson5Page(Model model){
        model.addAttribute("numbers", chapter1Service.getLesson5Numbers());
        return "chapter1/1.5";
    }

    @GetMapping("/lesson6")
    public String getLesson6Page(Model model){
        model.addAttribute("number", chapter1Service.getLesson6Number());
        return "chapter1/1.6";
    }
}
