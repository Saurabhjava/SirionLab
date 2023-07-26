package com.sirion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirion.entity.Person;
import com.sirion.repo.PersonRepo;
@Service
public class PersonService {
	@Autowired
	private PersonRepo repo;
	
	public void addPerson(Person p) {
		repo.saveAndFlush(p);
		System.out.println("Person Created..");
	}
	public Person getPerson(int pid) {
		Optional<Person> op=repo.findById(pid);
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
}
