package com.loginapp.loginapp.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class UserDTO {
	private Long id;
	
	private String username;
	
	private String password;
	
	private String passwordConfirm;
	
}
