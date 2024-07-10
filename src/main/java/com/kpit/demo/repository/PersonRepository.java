package com.kpit.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpit.demo.model.Person;



public interface PersonRepository extends JpaRepository<Person,String> {
	 Person findByEmail(String email);

}
