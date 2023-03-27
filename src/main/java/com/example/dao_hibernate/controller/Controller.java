package com.example.dao_hibernate.controller;

import com.example.dao_hibernate.Person;
import com.example.dao_hibernate.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPerson(@RequestParam("city") String city) {
        return repository.getByCity(city);
    }
}
