package com.example.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public int addition(){
        int a=54;
        int b=45;
        int c=a+b;
        return c;
    }

    @RequestMapping("/plus/{a}/{b}")
    public String addition2(@PathVariable int a, @PathVariable int b){
        int c=a+b;
        return "Addition is: "+c;
    }

    @RequestMapping("/multiplication/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b){
        int c=a*b;
        return c;
    }

    @RequestMapping("/into/{a}/{b}")
    public String multiply2(@PathVariable int a, @PathVariable int b){
        int c=a*b;
        return "multiplication is: "+c;
    }

    
}
