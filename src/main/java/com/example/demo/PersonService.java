package com.example.demo;


import com.example.demo.Person;
import com.example.demo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
