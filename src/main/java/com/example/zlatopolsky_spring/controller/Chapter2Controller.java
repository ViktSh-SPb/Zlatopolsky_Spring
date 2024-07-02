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

    @GetMapping("/lesson3")
    public String getLesson3Page(){
        return "chapter2/2.3";
    }

    @PostMapping("/lesson3")
    public String getLesson3ResultPage(Model model,
                                       @RequestParam("a") Integer a,
                                       @RequestParam("x") Integer x){
        model.addAttribute("a", a);
        model.addAttribute("x", x);
        model.addAttribute("result_a", chapter2Service.getLesson3aResult(a));
        model.addAttribute("result_x", chapter2Service.getLesson3xResult(x));
        return "chapter2/2.3_result";
    }

    @GetMapping("/lesson4")
    public String getLesson4Page(){
        return "chapter2/2.4";
    }

    @PostMapping("/lesson4")
    public String getLesson4ResultPage(Model model, @RequestParam("x") Integer x){
        model.addAttribute("x", x);
        model.addAttribute("perimeter", 4*x);
        return "chapter2/2.4_result";
    }

    @GetMapping("/lesson5")
    public String getLesson5Page(){
        return "chapter2/2.5";
    }

    @PostMapping("/lesson5")
    public String getLesson5ResultPage(Model model, @RequestParam("radius") Integer radius){
        model.addAttribute("radius", radius);
        model.addAttribute("diameter", 2*radius);
        return "chapter2/2.5_result";
    }

    @GetMapping("/lesson6")
    public String getLesson6Page(){
        return "chapter2/2.6";
    }

    @PostMapping("/lesson6")
    public String getLesson6ResultPage(Model model, @RequestParam("h") Integer h){
        model.addAttribute("h", h);
        model.addAttribute("l", chapter2Service.getLesson6Result(h));
        return "chapter2/2.6_result";
    }

    @GetMapping("/lesson7")
    public String getLesson7Page(){
        return "chapter2/2.7";
    }

    @PostMapping("/lesson7")
    public String getLesson7ResultPage(Model model, @RequestParam("x") Integer x){
        model.addAttribute("x", x);
        model.addAttribute("v", chapter2Service.getLesson7volume(x));
        model.addAttribute("s", chapter2Service.getLesson7square(x));
        return "chapter2/2.7_result";
    }
}