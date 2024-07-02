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

    public double getLesson3aResult(Integer a){
        return Math.sqrt((2*a+Math.sin(Math.abs(3*a)))/3.56);
    }

    public double getLesson3xResult(Integer x){
        return Math.sin((3.2+Math.sqrt(1+x))/Math.abs(5*x));
    }

    public Integer getLesson6Result(Integer h){
        final Integer R = 6350000;
        return (int)Math.round(Math.sqrt(2*R*h));
    }
}
