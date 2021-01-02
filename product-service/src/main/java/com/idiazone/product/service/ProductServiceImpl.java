package com.idiazone.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idiazone.product.model.Product;
import com.idiazone.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return this.productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(Integer id) {
		return this.productRepository.getProductById(id);
	}

}
