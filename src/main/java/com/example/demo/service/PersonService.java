package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.body.CreateBodyPerson;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person info(String id) {
        return repository.findByID(id).orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }
    
    public Person save(CreateBodyPerson body) {
        Person person = new Person();
        person.setLastName(body.getLastName());
        person.setFirstName(body.getFirstName());
        person.setAge(body.getAge());
        return repository.save(person);
    }

    
}
