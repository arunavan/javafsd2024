package com.var.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.var.entity.Product;
import com.var.service.ProductService;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public String  addProduct(@RequestBody Product product)
	{
		productService.addProduct(product);
		return "Added";
	}
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		return productService.getProduct(id);
		
	}
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
		
	}
	
	@PutMapping("/product/{id}")
	public String updateProduct(@PathVariable("id") Integer id,@RequestBody Product product) {
		 productService.updateProduct(id,product);
		 return "updated";
		
	}
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable("id") Integer id) {
		 productService.deleteProduct(id);
		 return "deleted";
		
	}
	

}
