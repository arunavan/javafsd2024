package com.var.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.var.entity.Product;
import com.var.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> getAllProducts() {
		return (List)productRepository.findAll();
	}
	public Product getProduct(Integer id) {
		return productRepository.findById(id).get();
	}
	public void  deleteProduct(Integer id) {
		 productRepository.deleteById(id);
	}
	public void  updateProduct(Integer id,Product product) {
		 Product product1=productRepository.findById(id).get();
		 product1.setName(product.getName());
	}

}
