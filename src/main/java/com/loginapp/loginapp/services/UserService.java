package com.loginapp.loginapp.services;

import com.loginapp.loginapp.model.User;

public interface UserService {
	/**
	 * 
	 * @param user
	 */
	public void saveUser(User user);
	/**
	 * 
	 * @param username
	 * @return
	 */
	public String findByUsername(String username);
}
