package com.gft.exception;

public class EntityNotFoundException extends ApiException {

	private static final long serialVersionUID = 8766566498150867601L;

	public EntityNotFoundException(String message) {
		super(message);
	}

}