package com.example.springcodingexercises.controller;

import com.example.springcodingexercises.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/hello")
public class DemoController {

    @GetMapping
    String helloWorld() {
        return "hello world";
    }

    @PostMapping
    Person getPerson(@RequestBody Person person) {
        long id = person.getId();
        String name = person.getName();

        Person newPerson = new Person();
        newPerson.setId(id);
        newPerson.setName(name + "_DEMO");
        return newPerson;
    }
}