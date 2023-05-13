package com.example.springcodingexercises.service;

import com.example.springcodingexercises.model.Person;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String helloWorld() {
        return "hello world";
    }

    public Person getPerson(Person person) {
        long id = person.getId();
        String name = person.getName();

        Person newPerson = new Person();
        newPerson.setId(id);
        newPerson.setName(name + "_DEMO");
        return newPerson;
    }
}
