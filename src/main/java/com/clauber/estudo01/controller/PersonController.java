package com.clauber.estudo01.controller;

import com.clauber.estudo01.dto.response.MessageResponseDTO;
import com.clauber.estudo01.entity.Person;
import com.clauber.estudo01.repository.PersonRepository;
import com.clauber.estudo01.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person)
    {
        return personService.createPerson(person);
    }
}
