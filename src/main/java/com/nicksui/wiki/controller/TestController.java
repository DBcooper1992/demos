package com.nicksui.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//返回字符串
@RestController
@RequestMapping(value="/api/test")
//返回页面
//@Controller
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, "+name;
    }
}
