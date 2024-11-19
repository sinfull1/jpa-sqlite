package com.example.demo;



import com.example.demo.Person;
import com.example.demo.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    // Create a new person
    @PostMapping
    public Person createPerson() {

        Person person = new Person();
        person.setEmail("test@gmail.com");
        person.setName(UUID.randomUUID().toString());
        return personService.savePerson(person);
    }

    // Get a list of all persons
    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    // Get a person by ID
    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    // Delete a person by ID
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}
