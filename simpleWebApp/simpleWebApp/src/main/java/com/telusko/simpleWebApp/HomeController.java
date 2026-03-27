package com.telusko.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet(){
        return "Welcome to the Rinkal";
    }
    @RequestMapping("/about")
    public String about(){
        return "Hii i am Rinkal Yadav";
    }
}
