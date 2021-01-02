package com.idiazone.product.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.idiazone.product.model.Status;
import com.idiazone.product.response.ProductResponse;

@ControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler(InvalidProductException.class)
	public ResponseEntity<ProductResponse> getFailureOnInvalidUser( InvalidProductException exception, WebRequest request){
		ProductResponse response = new ProductResponse();
		response.setStatus(Status.FAILURE);
		StringBuilder errorMessageBuilder = new StringBuilder();
		if(exception.getInvalidProductId() != null) {
			errorMessageBuilder
				.append("Product")
				.append(" ")
				.append(String.valueOf(exception.getInvalidProductId()))
				.append(": ");
		}
		if(exception.getErrorMessage() != null) {
			errorMessageBuilder.append(exception.getErrorMessage());
		}
		response.setMessage(errorMessageBuilder.toString());
		return ResponseEntity.ok(response);
			
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ProductResponse> getFailureOnInvalidUser( Exception exception, WebRequest request){
		ProductResponse response = new ProductResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(Status.FAILURE.name());
		return ResponseEntity.ok(response);
			
	}
	

	

}
