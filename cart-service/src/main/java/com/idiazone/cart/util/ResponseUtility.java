package com.idiazone.cart.util;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.idiazone.cart.model.Cart;
import com.idiazone.cart.response.BaseResponse;
import com.idiazone.cart.response.CartResponse;
import com.idiazone.cart.response.Status;
import com.idiazone.cart.response.UserResponse;

public class ResponseUtility {
	
	public static ResponseEntity<CartResponse> getSucessResponse(Cart Cart) {
		CartResponse response = new CartResponse();
		response.setCart(Cart);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<CartResponse> getSucessResponse(List<Cart> Carts) {
		CartResponse response = new CartResponse();
		response.setCarts(Carts);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<CartResponse> getFailureResponse(String failureMessage) {
		CartResponse response = new CartResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<CartResponse> getFailureResponse(String failureMessage,HttpStatus status) {
		CartResponse response = new CartResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.status(status).body(response);
	}
	
public static <T extends BaseResponse> boolean isValidResponse(ResponseEntity<T> response) {
	
	return HttpStatus.OK.equals(response.getStatusCode()) && response.hasBody()
			&& Status.SUCCESS.equals(response.getBody().getStatus());
		
	}
	
}
