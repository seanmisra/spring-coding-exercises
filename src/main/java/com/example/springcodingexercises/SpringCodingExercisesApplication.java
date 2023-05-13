package com.example.springcodingexercises;

import com.example.springcodingexercises.model.Person;
import com.example.springcodingexercises.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCodingExercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCodingExercisesApplication.class, args);
    }

}
