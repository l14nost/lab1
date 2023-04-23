package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        return "greeting";
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }
    @PostMapping("/result")
    public String result(@RequestParam String name,@RequestParam String test1, @RequestParam String test2, @RequestParam String test3,@RequestParam String test4, @RequestParam String test5, @RequestParam String test6, @RequestParam String test7, @RequestParam String test8, @RequestParam int test9a, @RequestParam int test9b,@RequestParam int test9c,@RequestParam int test10a,@RequestParam int test10b,@RequestParam int test10c,Model model){
        int mark = 0;
        if(test1.equals("b")){
            mark++;
        }
        if (test2.equals("c")){
            mark++;
        }
        if (test3.equals("b")){
            mark++;
        }
        if (test4.equals("b")){
            mark++;
        }
        if (test5.equals("a,b")){
            mark++;
        }
        if (test6.equals("a,c")){
            mark++;
        }
        if (test7.equals("a,c")){
            mark++;
        }
        if (test8.equals("a,b")){
            mark++;
        }
        if (test9a == 1&& test9b == 3&& test9c == 2){
            mark++;
        }
        if (test10a == 1&& test10b == 2&& test10c == 3){
            mark++;
        }
        model.addAttribute("name", name);
        model.addAttribute("mark", Integer.toString(mark));
        return "result";
    }
}