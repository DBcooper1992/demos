package com.nicksui.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${test.hello:TEST}")//冒号后是默认配置，当无配置时候，采用冒号后的默认值。
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "hello world!"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, "+name;

    }
}
