package com.example.springcodingexercises;

import com.example.springcodingexercises.model.Person;
import com.example.springcodingexercises.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            Person person = new Person("Sean");
            personRepository.save(person);

            Person personTwo = new Person("John");
            personRepository.save(personTwo);
        };
    }
}
