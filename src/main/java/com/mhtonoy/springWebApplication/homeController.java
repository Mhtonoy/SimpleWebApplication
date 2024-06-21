package com.mhtonoy.springWebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to simple Spring Web Application.";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we Educate!!";
    }
}
