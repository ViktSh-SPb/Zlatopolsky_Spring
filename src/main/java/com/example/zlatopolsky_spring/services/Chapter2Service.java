package com.example.zlatopolsky_spring.services;

import org.springframework.stereotype.Service;

@Service
public class Chapter2Service {

    public Integer getLesson1aResult(Integer x){
        return 17*(x*x)-6*x+13;
    }
    public Integer getLesson1bResult(Integer a){
        return 3*(a*a)+5*a-21;
    }

    public double getLesson2Result(Integer a){
        return (a*a+10)/Math.sqrt(a*a+1);
    }
}
