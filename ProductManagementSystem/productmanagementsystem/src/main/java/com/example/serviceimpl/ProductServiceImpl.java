package com.example.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

//import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository repo;
	
	@Override
	//Saving the Product details by jpa repository save()
	public Product saveProduct(Product p) {
		return repo.save(p);
	}
	
	@Override
	//Fetching all Products form the table by the jpa repository findAll()
	public List<Product>getAllProduct(){
		return repo.findAll();
	}
	
	@Override
	//fetching user details by jpa repository
	public Product getProductById(int id ) {
		return repo.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found in table"));
	}
	
	@Override
	public Product updateProductById(Product p , int id) {
		//find by id , if not present then throw custom exception
		Product exitproduct = repo.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found in table"));
		//set new values
		 exitproduct.setProductSku(p.getProdcutSku());
		 exitproduct.setProductName(p.getProductName());
		 exitproduct.setProductDescription(p.getProductDescription());
		 exitproduct.setProductImageUrl(p.getProductImageUrl());
		 exitproduct.setProductActive(p. getProductActive());
		 exitproduct. setProductdateCreated(p.getProductdateCreated());
		 exitproduct. setProductLastUpdated(p.getProductLastUpdated());
		 repo.save(exitproduct);
			return null ;
		 
	}
	@Override
	//fetching product details using jpa repository findById and removing it using deleteById
	public void deleteProductById(int id) {
	
		repo.findById(id).orElseThrow(() -> new ProductNotFoundException("User not found in table"));
		repo.deleteById(id);
		
	}

}
