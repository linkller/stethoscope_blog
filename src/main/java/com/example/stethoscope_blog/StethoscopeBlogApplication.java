package com.example.stethoscope_blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan("com.example.stethoscope_blog.dao.map")
@ServletComponentScan("com.example.stethoscope_blog.filter")
@SpringBootApplication
public class StethoscopeBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(StethoscopeBlogApplication.class, args);

    }

}
