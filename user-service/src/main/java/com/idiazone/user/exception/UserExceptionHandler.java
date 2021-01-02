package com.idiazone.user.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.idiazone.user.response.Status;
import com.idiazone.user.response.UserResponse;

@ControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(InvalidUserException.class)
	public ResponseEntity<UserResponse> getFailureOnInvalidUser( InvalidUserException exception, WebRequest request){
		UserResponse response = new UserResponse();
		response.setStatus(Status.FAILURE);
		StringBuilder errorMessageBuilder = new StringBuilder();
		if(exception.getInvalidUserId() != null) {
			errorMessageBuilder
				.append("User")
				.append(" ")
				.append(String.valueOf(exception.getInvalidUserId()))
				.append(": ");
		}
		if(exception.getErrorMessage() != null) {
			errorMessageBuilder.append(exception.getErrorMessage());
		}
		response.setMessage(errorMessageBuilder.toString());
		return ResponseEntity.ok(response);
			
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<UserResponse> getFailureOnInvalidUser( Exception exception, WebRequest request){
		UserResponse response = new UserResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(Status.FAILURE.name());
		return ResponseEntity.ok(response);
			
	}
	

	

}
