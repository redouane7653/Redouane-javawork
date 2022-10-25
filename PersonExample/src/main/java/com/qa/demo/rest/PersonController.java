package com.qa.demo.rest;

import java.util.List;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.qa.demo.persistence.domain.Person;
//import com.qa.demo.service.PersonService;


import javax.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.domain.PersonDTO;
import com.qa.demo.service.PersonService;


@RestController
public class PersonController {
    private PersonService service;
    public PersonController(PersonService service) {
        super();
        this.service = service;
    }
    @PostMapping("/create")
    public PersonDTO addPerson(@RequestBody Person person) {
        return this.service.addPerson(person);
    }
    @GetMapping("/getAll")
    public List<PersonDTO> getAllPeople() {
        return this.service.getAllPeople();
    }
 @PutMapping("/update")
    public PersonDTO updatePerson(@PathParam("id") Long id, @RequestBody Person person) {
        return this.service.updatePerson(id, person);
    }
    @DeleteMapping("/delete/{id}")
    public boolean removePerson(@PathVariable Long id) {
        return this.service.removePerson(id);
    }
    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }
}