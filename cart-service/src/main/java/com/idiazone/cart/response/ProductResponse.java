package com.idiazone.cart.response;

import java.util.List;

import com.idiazone.cart.model.Product;

public class ProductResponse  extends BaseResponse {

	private Product product;
	
	private List<Product> products;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
