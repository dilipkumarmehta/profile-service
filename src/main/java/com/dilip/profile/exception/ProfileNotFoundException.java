package com.dilip.profile.exception;

public class ProfileNotFoundException extends RuntimeException {

	private String message;

	public ProfileNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message.toString();
	}

}
