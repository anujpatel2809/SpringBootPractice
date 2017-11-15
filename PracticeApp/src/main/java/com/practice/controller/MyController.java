package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.User;

@RestController
public class MyController {

	@RequestMapping(value="/hello")
	public ResponseEntity<User> helloWorld(){
		return new ResponseEntity<User>(new User("Anuj"), HttpStatus.OK);
	}
	
}
