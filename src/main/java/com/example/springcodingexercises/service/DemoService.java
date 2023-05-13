package com.example.springcodingexercises.service;

import com.example.springcodingexercises.model.Person;
import com.example.springcodingexercises.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private final PersonRepository repository;

    DemoService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person getPersonByName(String name) {
        List<Person> persons = this.repository.findByName(name);
        return persons.get(0); // for now return first result
    }

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
