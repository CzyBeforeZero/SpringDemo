package com.demo.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo/spring")
public class DemoController {

    @GetMapping("/test")
    public String test() {
        System.out.println("陈自元");
        return "陈自元";
    }

    public static void main(String[] args) {
        System.out.println(DemoController.class.getClassLoader());
        System.out.println(DemoController.class.getClassLoader().getParent());
        System.out.println(String.class.getClassLoader());
    }

}
