package com.idiazone.product.response;

import java.util.List;

import com.idiazone.product.model.Product;
import com.idiazone.product.model.Status;

public class ProductResponse {

	private Product product;
	
	private List<Product> products;
	
	private Status status;
	
	private String message;

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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
