package com.loginapp.loginapp.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.loginapp.loginapp.exceptions.LoginRegistrationErrorException;
import com.loginapp.loginapp.exceptions.UserLoginExistException;
import com.loginapp.loginapp.exceptions.EmailLoginExistException;
import com.loginapp.loginapp.exceptions.Error;

@ControllerAdvice
public class ExceptionController {
	private Error errorDetail;

	@ExceptionHandler(LoginRegistrationErrorException.class)
	public ResponseEntity<Error> loginRegistrationError(LoginRegistrationErrorException ex, WebRequest request) {
		errorDetail = new Error(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Error>(errorDetail, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserLoginExistException.class)
	public ResponseEntity<Error> userLoginExistError(UserLoginExistException ex, WebRequest request) {
		errorDetail = new Error(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Error>(errorDetail, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmailLoginExistException.class)
	public ResponseEntity<Error> emailLoginExistError(EmailLoginExistException ex, WebRequest request) {
		errorDetail = new Error(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Error>(errorDetail, HttpStatus.BAD_REQUEST);
	}

}
