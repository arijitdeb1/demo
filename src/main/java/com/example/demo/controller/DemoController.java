package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/test1")
    public String test1(){
        System.out.println("branch commit 1");
        System.out.println("master commit 1");
        return "test1";
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println("branch commit 2");
         System.out.println("master commit 2");
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(){
        System.out.println("branch commit 3");
         System.out.println("master commit 3");
        return "test3";
    }

    @GetMapping("/test4")
    public String test4(){
        System.out.println("commit from branch1");
        return "test4";
    }

    @GetMapping("/test5")
    public String test5(){

        return "test5";
    }
}
