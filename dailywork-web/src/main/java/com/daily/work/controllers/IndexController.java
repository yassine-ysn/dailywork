package com.daily.work.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index", "/welcome"})
    public String getIndexPage(){
        return "welcome";
    }
}

