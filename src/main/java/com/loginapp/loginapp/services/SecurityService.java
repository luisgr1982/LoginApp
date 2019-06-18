package com.loginapp.loginapp.services;

public interface SecurityService {
	/**
	 * 
	 * @return
	 */
	String findLoggedInUsername();
	/**
	 * 
	 * @param username
	 * @param password
	 */
	void autoLogin(String username, String password);
}
