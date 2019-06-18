package com.loginapp.loginapp.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class RoleDTO {
	private Long id;
	
	private String name;
}
