package com.example.service;

import java.util.List;

import com.example.model.Product;

//Product service interface
public interface ProductService {
	
	//inserting product details
	Product saveProduct(Product p);
	
	//fatching all Product Details from table
	List<Product>getAllProduct();
	
	//fetching Product Details from table
	Product getProductById(int id );
	
	//Modifing the Product Details from the table by the ProductId
	Product updateProductById(Product p , int id);
	
	//remove the product details from table by Product id
	void deleteProductById(int id);
}
