package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
@RestController
public class CustomerController {
	@GetMapping("/customer")
	public ResponseEntity<Customer> getCustomerDetails() {
		Customer c=new Customer(123,"Ram","ram@gmail.com");
		return new ResponseEntity<>(c,HttpStatus.OK);
	}
	@GetMapping("/welcome")
	public  String getMessage() {
		
		return "welcome to Spring Boot";
	}
	@GetMapping("/customers")
	public List<Customer> getAllCustomerDetails() {
		Customer c=new Customer(123,"Ram","ram@gmail.com");
		Customer c1=new Customer(124,"SriRam","ram1@gmail.com");
		Customer c2=new Customer(125,"JaiRam","ram2@gmail.com");
		Customer c3=new Customer(126,"JaiJaiRam","ram2@gmail.com");
		
		List<Customer> clist=new ArrayList<>();
		clist.add(c);
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		return clist;
	}
	@PostMapping("/customer")
	public String addCustomer() {
		return "customer added........";
	}
	@PutMapping("/customer")
	public String updateCustomer() {
		return "customer updated........";
	}
	@DeleteMapping("/customer")
	public String deleteCustomer() {
		return "customer deleted............";
	}

}
