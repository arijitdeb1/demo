package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/test1")
    public String test1(){
        System.out.println("local change after keep test commit");
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println("local change commit 12 test");
        return "test2";
    }
}
