package com.loginapp.loginapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginapp.loginapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
