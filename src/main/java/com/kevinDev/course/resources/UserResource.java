package com.kevinDev.course.resources;

import org.springframework.web.bind.annotation.RestController;

import com.kevinDev.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	public ResponseEntity<User> findAll(){
		User u = new User(1L, null, null, null, null);
		return ResponseEntity.ok().body(u);
	}
}
