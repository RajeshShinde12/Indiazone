package com.idiazone.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiazone.product.response.ProductResponse;
import com.idiazone.product.service.ProductService;
import com.idiazone.product.util.ResponseUtility;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<ProductResponse> getAllProducts(){
		return ResponseUtility.getSucessResponse(this.productService.getAllProducts());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductResponse> getProductById(@PathVariable("id") Integer id){
		return ResponseUtility.getSucessResponse(this.productService.getProductById(id));
	}
}
