package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.body.CreateBodyPerson;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable String id) {
        return personService.info(id);
    }

    @PostMapping("/create")
    public Person creatPerson(@RequestBody CreateBodyPerson body) {
        return personService.save(body);
    }
}
