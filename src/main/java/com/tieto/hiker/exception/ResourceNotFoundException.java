package com.tieto.hiker.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super(new RuntimeException("Resource not found"));
	}
}
