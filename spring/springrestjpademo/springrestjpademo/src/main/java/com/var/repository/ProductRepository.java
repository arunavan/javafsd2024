package com.var.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.var.entity.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product,Integer>{
	// save, findById(), findAll,deleteById,...

}
