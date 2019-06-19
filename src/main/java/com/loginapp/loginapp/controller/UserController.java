package com.loginapp.loginapp.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginapp.loginapp.dto.UserDTO;
import com.loginapp.loginapp.exceptions.EmailLoginExistException;
import com.loginapp.loginapp.exceptions.UserLoginExistException;
import com.loginapp.loginapp.services.UserService;
import com.loginapp.loginapp.utils.UserMapperServiceImpl;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapperServiceImpl mapper;
	
	@PostMapping("/register")
	public ResponseEntity<UserDTO> registrationUserAccount(@Valid @RequestBody UserDTO userDTO) throws UserLoginExistException, EmailLoginExistException {
		if (Optional.ofNullable(userService.findByUsername(userDTO.getUsername())).isPresent()) throw new UserLoginExistException();
		if (Optional.ofNullable(userService.findByEmail(userDTO.getEmail())).isPresent()) throw new EmailLoginExistException();
		
		userService.saveUser(mapper.mapToEntity(userDTO));
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.OK);
	}

	@GetMapping("/login")
	public String welcome() {
		return "login";
	}
}
