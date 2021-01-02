package com.idiazone.cart.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.idiazone.cart.model.Cart;
import com.idiazone.cart.model.Product;
import com.idiazone.cart.model.User;
import com.idiazone.cart.response.ProductResponse;
import com.idiazone.cart.response.UserResponse;
import com.idiazone.cart.util.ResponseUtility;

@Repository
public class CartRepositoryImpl implements CartRepository {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${service.url.user}")
	private String userServiceUrl;

	@Value("${service.url.product}")
	private String productServiceUrl;

	@Override
	public Cart getCartOfUser(Integer userId) {
		
		Cart cart = new Cart();
		cart.setProducts(getAllProducts());
		cart.setUser(getUserById(userId));
		return cart;
	}

	public User getUserById(Integer userId) {
		ResponseEntity<UserResponse> response = this.restTemplate.getForEntity(this.userServiceUrl + "/user/" + userId, UserResponse.class);
		User user = null;
		if (ResponseUtility.isValidResponse(response)) {
			user = response.getBody().getUser();
		}
		return user;
	}
	
	
	public List<Product> getAllProducts() {
		ResponseEntity<ProductResponse> response = this.restTemplate.getForEntity(this.productServiceUrl + "/product/all", ProductResponse.class);
		List<Product> products= null;
		if (ResponseUtility.isValidResponse(response)) {
			products = response.getBody().getProducts();
		}
		return products;
	}

}
