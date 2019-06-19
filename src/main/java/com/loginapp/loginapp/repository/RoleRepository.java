package com.loginapp.loginapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginapp.loginapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByName(String role);
}
