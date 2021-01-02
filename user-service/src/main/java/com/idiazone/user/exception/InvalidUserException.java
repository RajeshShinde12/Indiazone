package com.idiazone.user.exception;

public class InvalidUserException extends BaseException {
	
	private static final long serialVersionUID = 2748961644368816669L;
	
	private final Integer invalidUserId;

	public InvalidUserException(Integer userId, Throwable cause, String errorMessage, Class<?> exceptionInitiatedClass, String method) {
		super(cause, errorMessage, exceptionInitiatedClass, method);
		this.invalidUserId = userId;
	}
	
	public InvalidUserException(Throwable cause,String errorMessage, Class<?> exceptionInitiatedClass, String method) {
		super(cause, errorMessage, exceptionInitiatedClass, method);
		this.invalidUserId = null;
	}
	
	public InvalidUserException(Integer userId, Throwable cause, String errorMessage, Class<?> exceptionInitiatedClass) {
		super(cause, errorMessage, exceptionInitiatedClass, null);
		this.invalidUserId = userId;
	}
	
	public InvalidUserException(Throwable cause,String errorMessage, Class<?> exceptionInitiatedClass) {
		super(cause, errorMessage, exceptionInitiatedClass,null);
		this.invalidUserId = null;
	}

	public Integer getInvalidUserId() {
		return invalidUserId;
	}

	

	
}
