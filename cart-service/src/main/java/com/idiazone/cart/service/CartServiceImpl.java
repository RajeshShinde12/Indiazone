package com.idiazone.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiazone.cart.model.Cart;
import com.idiazone.cart.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository cartRepository;

	@Override
	public Cart getCartOfUser(Integer userId) {
		return this.cartRepository.getCartOfUser(userId);
	}

}
