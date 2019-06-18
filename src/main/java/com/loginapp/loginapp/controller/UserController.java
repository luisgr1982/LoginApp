package com.loginapp.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loginapp.loginapp.dto.UserDTO;
import com.loginapp.loginapp.services.UserService;
import com.loginapp.loginapp.utils.UserMapperServiceImpl;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapperServiceImpl mapper;
	
	@PostMapping("/registration")
	public ResponseEntity<?> registrationUser(@RequestBody UserDTO userDTO) {
		userService.saveUser(mapper.mapToEntity(userDTO));
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/login")
	public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO) {
		return null;
	}
}
