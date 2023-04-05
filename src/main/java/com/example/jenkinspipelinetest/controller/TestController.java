package com.example.jenkinspipelinetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String test1(){
        return "Hello world!";
    }

    @GetMapping(value = "/test")
    public String test2(){
        return "Jenkins pipeline works!";
    }

}
