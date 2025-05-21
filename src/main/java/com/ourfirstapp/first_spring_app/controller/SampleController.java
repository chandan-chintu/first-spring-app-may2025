package com.ourfirstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String getSample1(){
        return "This is sample1 API";
    }

    @GetMapping("/sample2")
    public String getSample2(){
        return "This is sample2 API";
    }
}
