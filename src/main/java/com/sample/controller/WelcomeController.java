package com.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by loon on 16/5/18.
 */

@RestController
public class WelcomeController {


    @Value("${name:World}")
    private String name;


    @RequestMapping("/hello")
    public String sayHello(){
        return String.format("hello:%s", name);
    }
}
