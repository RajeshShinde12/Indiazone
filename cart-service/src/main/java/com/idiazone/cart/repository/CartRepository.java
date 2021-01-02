package com.idiazone.cart.repository;

import com.idiazone.cart.model.Cart;

public interface CartRepository {

	public Cart getCartOfUser(Integer userId);

}
