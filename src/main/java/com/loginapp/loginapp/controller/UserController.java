package com.loginapp.loginapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginapp.loginapp.dto.UserDTO;
import com.loginapp.loginapp.exceptions.LoginRegistrationErrorException;
import com.loginapp.loginapp.services.UserService;
import com.loginapp.loginapp.utils.UserMapperServiceImpl;
import com.loginapp.loginapp.validator.UserValidator;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapperServiceImpl mapper;
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> registrationUser(@Valid @RequestBody UserDTO userDTO){

		return ResponseEntity.ok().build();
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
