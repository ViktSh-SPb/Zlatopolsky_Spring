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
}
