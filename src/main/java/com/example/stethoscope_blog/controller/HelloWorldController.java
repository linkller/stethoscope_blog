package com.example.stethoscope_blog.controller;

import com.example.stethoscope_blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

    @RequestMapping("/background.png")
    @ResponseBody
    public byte[] background() throws IOException {
        File file = new File("D:\\stethoscope_blog\\stethoscope_blog\\src\\main\\resources\\templates\\background.png");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

    @RequestMapping("findUserList")
    @ResponseBody
    public List<Map<String,Object>> findUserList(){
        return userService.findUserList();
    }
}
