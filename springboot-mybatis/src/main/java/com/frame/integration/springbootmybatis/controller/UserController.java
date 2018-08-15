package com.frame.integration.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @ResponseBody
    @GetMapping("/controller")
    public String controllerTest() {
        return "Hello World!";
    }
}
