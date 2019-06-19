package com.loginapp.loginapp.services;

import com.loginapp.loginapp.model.Role;
import com.loginapp.loginapp.model.User;

public interface RoleService {
	/**
	 * Metodo que busca un Rol
	 * 
	 * @param role
	 * @return
	 */
	public Role getRole(String role);
	
	public void saveUserRole(String role, User user);

}
