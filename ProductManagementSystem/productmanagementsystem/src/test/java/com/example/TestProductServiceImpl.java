package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.model.Product;

class TestProductServiceImpl {
	
	Product p = new Product();
	@Test
	//Positive Testing 
	//public void testgetProductName() {
	//	assertEquals("HP" , p.getProductName());
	//}
	// Negative Testing
	public void testgetProductid() {
		assertEquals("hey" , p.getProductActive() );
	}

}
