package com.idiazone.product.repository;

import java.util.List;

import com.idiazone.product.model.Product;

public interface ProductRepository {

	public List<Product> getAllProducts();

	public Product getProductById(Integer id);

}
