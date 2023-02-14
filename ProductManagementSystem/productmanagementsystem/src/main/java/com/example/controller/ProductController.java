package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService ps;
	 //saving product details using rest api post mapping
	  @PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p){
		return new ResponseEntity<Product>(ps.saveProduct(p),HttpStatus.CREATED);  
	}
    // get product details using rest api get Mapping
	@GetMapping("/getproduct")
	public List<Product> getAllProduct(){
		return ps.getAllProduct();
	}
    // get product details from table using rest api GET mapping with id attribute
	@GetMapping("/getproductbyid/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id")int id){
		return new ResponseEntity<Product>(ps.getProductById(id),HttpStatus.OK);
		  
	}
	 //updating Product details from table using rest api PUT mapping with id attribute
	   @PutMapping("/updatebyid/{id}")
	   public ResponseEntity<Product> updateProductById(@PathVariable("id") int id, @RequestBody Product p){
		   return new ResponseEntity<Product> (ps.updateProductById(p,id),HttpStatus.OK);
	   }
	 //delete product details from table using rest api delete mapping using id attribute
	   @DeleteMapping("/deleteproduct/{id}")
	   public ResponseEntity<String> deleteProductById(@PathVariable("id") int id){
		   ps.deleteProductById(id);
		   return new ResponseEntity<String>("Product deleted Successfully",HttpStatus.OK);
	   }
}