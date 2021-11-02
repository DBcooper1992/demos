package com.nicksui.wiki.controller;

import com.nicksui.wiki.domain.Demo;
import com.nicksui.wiki.domain.Test;
import com.nicksui.wiki.mapper.DemoMapper;
import com.nicksui.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//返回字符串
@RestController
@RequestMapping(value="/api/test")
//返回页面
//@Controller
public class TestController {

    @Value("${test.hello:TEST}")//冒号后是默认配置，当无配置时候，采用冒号后的默认值。
    private String testHello;

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/hello")
    public String hello(){
        return "hello world!"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post, "+name;

    }

    @GetMapping("/demoQuery")
    public Demo demoQuery(){
        return testService.list();
    }
}
