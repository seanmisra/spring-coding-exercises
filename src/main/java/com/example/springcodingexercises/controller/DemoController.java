package com.example.springcodingexercises.controller;

import com.example.springcodingexercises.model.Person;
import com.example.springcodingexercises.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/hello")
public class DemoController {
    private DemoService demoService;

    // @Autowired -> can omit autowired
    DemoController (DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    String helloWorld() {
        return this.demoService.helloWorld();
    }

    @PostMapping
    Person getPerson(@RequestBody Person person) {
        return this.demoService.getPerson(person);
    }
}