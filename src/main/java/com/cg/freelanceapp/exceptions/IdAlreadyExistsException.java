package com.cg.freelanceapp.exceptions;

	public class IdAlreadyExistsException extends RuntimeException {

		public IdAlreadyExistsException() {
			super();
		}

		public IdAlreadyExistsException(String message) {
			super(message);
		}

	}