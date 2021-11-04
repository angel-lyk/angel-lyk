package com.oz.controller;

import com.oz.service.GoodService;
import com.oz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private UserService userService;
    @Autowired
    private GoodService goodService;

    @GetMapping(value = "/hello")
    public String hello() {
        return "Customer Hello!";
    }

    @GetMapping(value = "/userHello")
    public String UserHello() {
        return userService.hello();
    }

    @GetMapping(value = "/goodHello")
    public String GoodHello() {
        return goodService.hello();
    }
}
