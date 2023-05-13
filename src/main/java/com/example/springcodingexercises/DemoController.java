package com.example.springcodingexercises;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/hello")
public class DemoController {

    @GetMapping
    String helloWorld() {
        return "hello world";
    }
}