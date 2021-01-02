package com.idiazone.cart.response;

import java.util.List;

import com.idiazone.cart.model.Cart;

public class CartResponse extends BaseResponse {

	private List<Cart> carts;
	private Cart cart;
	
	
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
}
