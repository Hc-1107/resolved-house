package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(){
        return "frame/index";
    }

    @GetMapping("main")
    public String main(){
        return "frame/main";
    }

}
