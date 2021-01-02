package com.idiazone.product.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.idiazone.product.exception.InvalidProductException;
import com.idiazone.product.model.Category;
import com.idiazone.product.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	Map<Integer,Product> products = new HashMap<>();
	
	@PostConstruct
	public void init() {
		this.products.put(1,
				new Product(1, "Iron", 100.0, 3, null, Arrays.asList("Pune", "Mumbai"), Category.ELECTRONIC));
		this.products.put(2,
				new Product(2, "Fan", 100.0, 3, null, Arrays.asList("Pune", "Mumbai"), Category.ELECTRONIC));
		this.products.put(3,
				new Product(3, "T-shirt", 100.0, 3, null, Arrays.asList("Pune", "Mumbai"), Category.FASHION));
	}

	@Override
	public List<Product> getAllProducts() {
		return this.products.entrySet().parallelStream().map(e->e.getValue()).collect(Collectors.toList());
	}

	@Override
	public Product getProductById(Integer id) {
		Product product = this.products.get(id);
		if(product == null) {
			throw new InvalidProductException(id,null,"Not Found",this.getClass(),"getProductById()");
		}
		return product;
	}

}
