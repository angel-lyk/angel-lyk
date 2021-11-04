package com.oz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good")
public class GoodController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "GoodTwo Hello Work!";
    }
}
