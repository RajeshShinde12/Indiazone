package com.idiazone.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiazone.cart.response.CartResponse;
import com.idiazone.cart.service.CartService;
import com.idiazone.cart.util.ResponseUtility;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;

	@GetMapping("/user/{id}")
	public ResponseEntity<CartResponse> getCartDetailsOfUser(@PathVariable("id") Integer userId) {
		return ResponseUtility.getSucessResponse(this.cartService.getCartOfUser(userId));
	}
	
}
