package com.bage.spring.boot.starter.web;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
    	System.out.println("Hello home!");
        return "Hello home!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}