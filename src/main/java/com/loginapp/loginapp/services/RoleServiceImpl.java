package com.loginapp.loginapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginapp.loginapp.model.Role;
import com.loginapp.loginapp.model.User;
import com.loginapp.loginapp.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Role getRole(String role) {
		return roleRepository.findByName(role);
	}

	@Override
	public void saveUserRole(String role, User user) {
		this.getRole(role).getUsers().add(user);
	}

}
