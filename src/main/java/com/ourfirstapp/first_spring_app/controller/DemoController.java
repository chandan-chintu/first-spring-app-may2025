package com.ourfirstapp.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo1(){
        System.out.println("Our first demo1 API - printing in console");
        return "Our first demo1 API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("Our demo2 API - printing in console");
        return "Our  demo2 API";
    }
}
