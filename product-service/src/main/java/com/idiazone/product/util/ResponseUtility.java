package com.idiazone.product.util;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.idiazone.product.model.Product;
import com.idiazone.product.model.Status;
import com.idiazone.product.response.ProductResponse;

public class ResponseUtility {
	
	public static ResponseEntity<ProductResponse> getSucessResponse(Product Product) {
		ProductResponse response = new ProductResponse();
		response.setProduct(Product);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<ProductResponse> getSucessResponse(List<Product> Products) {
		ProductResponse response = new ProductResponse();
		response.setProducts(Products);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<ProductResponse> getFailureResponse(String failureMessage) {
		ProductResponse response = new ProductResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<ProductResponse> getFailureResponse(String failureMessage,HttpStatus status) {
		ProductResponse response = new ProductResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.status(status).body(response);
	}
	
}
