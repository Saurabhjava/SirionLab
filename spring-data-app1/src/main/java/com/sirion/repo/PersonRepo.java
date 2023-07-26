package com.sirion.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirion.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
