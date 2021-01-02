package com.idiazone.cart.model;

import java.util.List;

public class Product {
	
	private Integer id;
	
	private String name;
	
	private Double amount;
	
	private Integer quantity;
	
	private List<String> images;
	
	private List<String> availableCities;
	
	private Category category;

	public Product(Integer id, String name, Double amount, Integer quantity, List<String> images, List<String> availableCities,
			Category category) {
		super();
		this.name = name;
		this.amount = amount;
		this.quantity = quantity;
		this.images = images;
		this.availableCities = availableCities;
		this.category = category;
		this.id = id;
	}
	
	public Product() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<String> getAvailableCities() {
		return availableCities;
	}

	public void setAvailableCities(List<String> availableCities) {
		this.availableCities = availableCities;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

}
