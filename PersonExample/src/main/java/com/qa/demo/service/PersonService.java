package com.qa.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.exceptions.PersonNotFoundException;
import com.qa.demo.persistence.repo.PersonRepo;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.qa.demo.persistence.domain.Person;
import com.qa.demo.persistence.domain.PersonDTO;
import com.qa.demo.persistence.exceptions.PersonNotFoundException;
import com.qa.demo.persistence.repo.PersonRepo;

@Service
public class PersonService {
	private PersonRepo repo;
	private ModelMapper mapper;

	public PersonService(PersonRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}

	private PersonDTO mapToDTO(Person person) {
		return this.mapper.map(person, PersonDTO.class);
	}

	public PersonDTO addPerson(Person person) {
		Person saved = this.repo.save(person);
		return this.mapToDTO(saved);
	}

	public List<PersonDTO> getAllPeople() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public PersonDTO updatePerson(Long id, Person newPerson) {
		Optional<Person> existingOptional = this.repo.findById(id);
		Person existing = existingOptional.get();
		existing.setAge(newPerson.getAge());
		existing.setName(newPerson.getName());
		Person updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean removePerson(Long id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
//	}
}}
//
//@Service
//public class PersonService {
//
//    private List<Person> people = new ArrayList<>();
//
//    public Person addPerson(Person person) {
//        // Add new Person
//        this.people.add(person);
//        // Return last added Person from List
//        return this.people.get(this.people.size() - 1);
//    }
//
//    public List<Person> getAllPeople() {
//        // Return the whole List
//        return this.people;
//    }
//
//    public Person updatePerson(int id, Person person) {
//        // Remove existing Person with matching 'id'
//        this.people.remove(id);
//        // Add new Person in its place
//        this.people.add(id, person);
//        // Return updated Person from List
//        return this.people.get(id);
//    }
//
//    public Person removePerson(int id) {
//        // Remove Person and return it
//        return this.people.remove(id);
//    }
//
//}
