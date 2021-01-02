package com.idiazone.user.exception;

public class BaseException  extends RuntimeException  {

	private static final long serialVersionUID = 2343309451874903925L;
	
	protected final Throwable exception;
	
	protected final Class<?> exceptionInitiatedClass;
	
	protected final String method;
	
	protected final String errorMessage;

	public BaseException(Throwable cause,String errorMessage, Class<?> exceptionInitiatedClass, String method) {
		super(cause);
		this.exception = cause;
		this.exceptionInitiatedClass = exceptionInitiatedClass;
		this.method = method;
		this.errorMessage = errorMessage;
	}

	public Throwable getException() {
		return exception;
	}

	public Class<?> getExceptionInitiatedClass() {
		return exceptionInitiatedClass;
	}

	public String getMethod() {
		return method;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
	
	

}
