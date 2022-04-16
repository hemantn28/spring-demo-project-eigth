package com.example.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

        @RestController
        public class VariableController {

        @RequestMapping("/Hi/{name}")
        public String memo(@PathVariable String name){
        return "Hi, How are you?"+name;

        }

        @RequestMapping("/Hey/{name}")
        public String msg(@PathVariable String name){
                return "Hey,What's up?"+name;
        }


        @RequestMapping("/your_age/{age}")
        public String checkAge(@PathVariable int age){
                if (age>18){
                        return "You are young";
                }
                else{
                        return "You are child";
                }
        }

        @RequestMapping("/your_marks/{marks}")
        public String checkMarks(@PathVariable int marks){
                if (marks>75){
                        return "You have got distinction";
                }
                else{
                        return "You haven't got distinction";
                }
        }


        @RequestMapping("/your_speed/{speed}")
        public String checkSpeed(@PathVariable int speed){
                if (speed>60){
                        return "You are driving fast";
                }
                else{
                        return "You are driving slow";
                }



        }
}
