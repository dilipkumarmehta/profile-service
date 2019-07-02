package com.dilip.profile.exception;

public enum MessageCode {
	INVALIDPROFILE("404", "Profile Not Found");

	private String status;
	private String message;

	private MessageCode(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
