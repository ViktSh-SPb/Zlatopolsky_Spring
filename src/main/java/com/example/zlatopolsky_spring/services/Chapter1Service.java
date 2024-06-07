package com.example.zlatopolsky_spring.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Chapter1Service {

    public List<Integer> getLesson1Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(31);
        numbers.add(18);
        numbers.add(79);
        return numbers;
    }

    public List<Integer> getLesson2Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(47);
        numbers.add(52);
        numbers.add(150);
        return numbers;
    }

    public List<Integer> getLesson3Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        return numbers;
    }

    public List<Integer> getLesson4Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(21);
        return numbers;
    }

    public List<Integer> getLesson5Numbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        return numbers;
    }

    public Double getLesson6Number() {
        double number = Math.PI;
        return number;
    }
}
