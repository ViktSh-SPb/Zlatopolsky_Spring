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
        return "1.1";
    }
}
