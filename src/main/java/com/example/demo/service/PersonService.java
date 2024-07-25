package com.example.demo.service;

import java.util.List;
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

    public Person getPerson(Long id) {
        return repository.findFirstById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }
    
    public Person creatPerson(CreateBodyPerson body) {
        Person person = new Person();
        person.setLastName(body.getLastName());
        person.setFirstName(body.getFirstName());
        person.setAge(body.getAge());
        person.setBirthDate(body.getBirthDate());
        return repository.save(person);
    }

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public Person updatePerson(Long id, CreateBodyPerson body) {
        Person person = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
        person.setFirstName(body.getFirstName());
        person.setLastName(body.getLastName());
        person.setAge(body.getAge());
        return repository.save(person);
    }

    public void deletePerson(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("User not found with id " + id);
        }
        repository.deleteById(id);
    }
}
