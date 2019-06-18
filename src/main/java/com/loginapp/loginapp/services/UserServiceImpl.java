package com.loginapp.loginapp.services;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.loginapp.loginapp.model.User;
import com.loginapp.loginapp.repository.RoleRepository;
import com.loginapp.loginapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	
	@Override
	public void saveUser(User user) {

	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
