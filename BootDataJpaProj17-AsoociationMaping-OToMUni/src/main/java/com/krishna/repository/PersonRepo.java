package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
