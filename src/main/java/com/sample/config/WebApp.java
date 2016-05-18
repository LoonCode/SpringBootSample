package com.sample.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by loon on 16/5/18.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.sample.controller") // 默认扫描当前目录
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
