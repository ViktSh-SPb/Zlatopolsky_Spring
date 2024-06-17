package com.example.zlatopolsky_spring.controller;

import com.example.zlatopolsky_spring.services.Chapter1Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/lesson7")
    public String getLesson7Page(Model model){
        model.addAttribute("number", chapter1Service.getLesson7Number());
        return "chapter1/1.7";
    }

    @GetMapping("/lesson8")
    public String getLesson8Page(){
        return "chapter1/1.8";
    }

    @PostMapping("/lesson8")
    public String getLesson8ResultPage(Model model, @RequestParam("number") Integer number){
        model.addAttribute("number", number);
        return "chapter1/1.8_result";
    }

    @GetMapping("/lesson9")
    public String getLesson9Page(){
        return "chapter1/1.9";
    }

    @PostMapping("/lesson9")
    public String getLesson9ResultPage(Model model, @RequestParam("number") Integer number){
        model.addAttribute("number", number);
        return "chapter1/1.9_result";
    }

    @GetMapping("/lesson10")
    public String getLesson10Page(){
        return "chapter1/1.10";
    }

    @PostMapping("/lesson10")
    public String getLesson10ResultPage(Model model, @RequestParam("name") String name){
        model.addAttribute("name", name);
        return "chapter1/1.10_result";
    }

    @GetMapping("/lesson11")
    public String getLesson11Page(){
        return "chapter1/1.11";
    }

    @PostMapping("/lesson11")
    public String getLesson11ResultPage(Model model, @RequestParam("name") String name){
        model.addAttribute("name", name);
        return "chapter1/1.11_result";
    }

    @GetMapping("/lesson12")
    public String getLesson12Page(){
        return "chapter1/1.12";
    }

    @PostMapping("/lesson12")
    public String getLesson12ResultPage(Model model, @RequestParam("name") String name){
        model.addAttribute("name", name);
        return "chapter1/1.12_result";
    }

    @GetMapping("/lesson13")
    public String getLesson13Page(){
        return "chapter1/1.13";
    }

    @PostMapping("/lesson13")
    public String getLesson13ResultPage(Model model, @RequestParam("number") Integer number){
        model.addAttribute("number", number);
        return "chapter1/1.13_result";
    }

    @GetMapping("/lesson14")
    public String getLesson14Page(){
        return "chapter1/1.14";
    }

    @PostMapping("/lesson14")
    public String getLesson14ResultPage(Model model,
                                        @RequestParam("number1") Integer number1,
                                        @RequestParam("number2") Integer number2,
                                        @RequestParam("number3") Integer number3){
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("number3", number3);
        return "chapter1/1.14_result";
    }

    @GetMapping("/lesson15")
    public String getLesson15Page(){
        return "chapter1/1.15";
    }

    @PostMapping("/lesson15")
    public String getLesson15ResultPage(Model model,
                                        @RequestParam("number1") Integer number1,
                                        @RequestParam("number2") Integer number2,
                                        @RequestParam("number3") Integer number3,
                                        @RequestParam("number4") Integer number4){
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("number3", number3);
        model.addAttribute("number4", number4);
        return "chapter1/1.15_result";
    }

    @GetMapping("/lesson16")
    public String getLesson16Page(){
        return "chapter1/1.16";
    }

    @PostMapping("/lesson16")
    public String getLesson16ResultPage(Model model,
                                        @RequestParam("t") Integer t,
                                        @RequestParam("v") Integer v,
                                        @RequestParam("x") Integer x,
                                        @RequestParam("y") Integer y){
        model.addAttribute("t", t);
        model.addAttribute("v", v);
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "chapter1/1.16_result";
    }

    @GetMapping("/lesson17")
    public String getLesson17Page(){
        return "chapter1/1.17";
    }

    @PostMapping("/lesson17")
    public String getLesson17ResultPage(Model model,
                                        @RequestParam("a") Integer a,
                                        @RequestParam("b") Integer b,
                                        @RequestParam("x") Integer x,
                                        @RequestParam("y") Integer y){
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "chapter1/1.17_result";
    }
}
