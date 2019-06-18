package com.loginapp.loginapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginapp.loginapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	/**
	 * Metodo que busca un usuario por su nombre
	 * 
	 * @param username
	 * @return devuelve un objeto User
	 */
	User findByUsername(String username);
}
