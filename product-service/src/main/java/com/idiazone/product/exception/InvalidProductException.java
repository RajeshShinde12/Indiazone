package com.idiazone.product.exception;

public class InvalidProductException extends BaseException {
	
	private static final long serialVersionUID = 2748961644368816669L;
	
	private final Integer invalidProductId;

	public InvalidProductException(Integer productId, Throwable cause, String errorMessage, Class<?> exceptionInitiatedClass, String method) {
		super(cause, errorMessage, exceptionInitiatedClass, method);
		this.invalidProductId = productId;
	}
	
	public InvalidProductException(Throwable cause,String errorMessage, Class<?> exceptionInitiatedClass, String method) {
		super(cause, errorMessage, exceptionInitiatedClass, method);
		this.invalidProductId = null;
	}
	
	public InvalidProductException(Integer userId, Throwable cause, String errorMessage, Class<?> exceptionInitiatedClass) {
		super(cause, errorMessage, exceptionInitiatedClass, null);
		this.invalidProductId = userId;
	}
	
	public InvalidProductException(Throwable cause,String errorMessage, Class<?> exceptionInitiatedClass) {
		super(cause, errorMessage, exceptionInitiatedClass,null);
		this.invalidProductId = null;
	}

	public Integer getInvalidProductId() {
		return invalidProductId;
	}

	

	
}
