package com.example.stethoscope_blog.controller;

import com.example.stethoscope_blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloWorldController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("findUserList")
    @ResponseBody
    public List<Map<String,Object>> findUserList(){
        return userService.findUserList();
    }
}
