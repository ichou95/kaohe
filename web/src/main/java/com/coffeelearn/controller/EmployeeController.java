package com.coffeelearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        return "success";
    }
}
