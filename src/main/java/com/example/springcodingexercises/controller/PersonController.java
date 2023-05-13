package com.example.springcodingexercises.controller;

import com.example.springcodingexercises.model.Person;
import com.example.springcodingexercises.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {
    private DemoService demoService;

    @Autowired
    void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
    @GetMapping
    Person getPersonByName(@RequestParam String name) {
        return this.demoService.getPersonByName(name);
    }
}
