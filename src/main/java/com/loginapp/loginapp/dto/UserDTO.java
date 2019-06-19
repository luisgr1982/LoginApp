package com.loginapp.loginapp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class UserDTO {
	private Long id;
	
	@NotEmpty
	@NotNull
	private String username;
	
	@NotEmpty
	@NotNull	
	private String password;
	
	@NotEmpty
	@NotNull
	private String passwordConfirm;
	
	@Email
	private String email;
}
