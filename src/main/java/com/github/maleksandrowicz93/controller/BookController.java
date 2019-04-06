package com.github.maleksandrowicz93.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/hello")
    public String hello() {
        return "{hello: world}";
    }

}
