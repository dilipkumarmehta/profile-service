package com.dilip.profile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
class ExceptionHandelerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ProfileNotFoundException.class)
	public ResponseEntity<Message> profileNotFoundException(ProfileNotFoundException ex) {
		Message msg = new Message(MessageCode.INVALIDPROFILE.getStatus(),
				MessageCode.INVALIDPROFILE.getMessage() + " : " + ex.getMessage());
		return new ResponseEntity<Message>(msg, HttpStatus.NOT_FOUND);

	}
}
