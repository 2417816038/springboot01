package com.zking.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

//    @ResponseBody
    @GetMapping("/hello")
    public String hello(String name){
        return "hello"+ name + ",ts=" +System.currentTimeMillis();
    }
}
