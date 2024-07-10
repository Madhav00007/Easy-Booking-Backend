package com.kpit.demo.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo.model.Person;
import com.kpit.demo.repository.PersonRepository;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class PersonController {
	
	@Autowired
	private PersonRepository personrepo;
	
	@GetMapping("/persons")
	public List<Person>getAllperson(){
		return personrepo.findAll();
		
	}
	
	@PostMapping("/persons")
	public Person createperson(@RequestBody Person person) {
		return personrepo.save(person);
	}
	
//	  @PostMapping("/login")
//	    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
//		  map = credentials;
//	        String email = credentials.get("email");
//	        String password = credentials.get("password");
//
//	        person person = personrepo.findByEmail(email);
//	        if (person == null || !person.getPassword().equals(password)) {
//	            return ResponseEntity.badRequest().body("Invalid email or password");
//	        }
//
//	        return ResponseEntity.ok().body("Login successful");
//	    }
	
	  @PostMapping("/login")
		public ResponseEntity<?> loginUser(@RequestBody Person userData){
			System.out.println(userData);
			Person user=personrepo.findByEmail(userData.getEmail());
			if(user.getPassword().equals(userData.getPassword()))
				return ResponseEntity.ok(user);
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	





}

