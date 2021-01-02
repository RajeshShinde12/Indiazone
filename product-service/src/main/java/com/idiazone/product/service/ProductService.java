package com.idiazone.product.service;

import java.util.List;

import com.idiazone.product.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(Integer id);

	

}
