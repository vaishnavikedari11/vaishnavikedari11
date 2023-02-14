package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "sku")
	    private String sku;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "price")
	    private BigDecimal price;

	    @Column(name = "image_url")
	    private String imageUrl;

	    @Column(name = "active")
	    private boolean active;

	    @Column(name = "date_created")
	    @CreationTimestamp
	    private Date dateCreated;

	    @Column(name = "last_updated")
	    @UpdateTimestamp
	    private Date lastUpdated;
	    
	    public Product() {
	    	
	    }
	    public Product(int id, String name) {
	    	this.id= id;
	    	this.name = name;
	    }
	    // getter and setter methods
	    
	    public void setProductId(int id) {
	    	this.id = id;
	    }
	    public void setProductSku(String sku) {
	    	this.sku = sku;
	    }
	    public void setProductName(String name) {
	    	this.name = name;
	    }
	    public void setProductDescription(String description) {
	    	this.description=description;
	    }
	    public void setProductImageUrl(String imageUrl) {
	    	this.imageUrl = imageUrl;
	    }
	    public void setProductActive(boolean active) {
	    	this.active = active;
	    }
	    public void setProductdateCreated(Date dateCreated) {
	    	this.dateCreated = dateCreated;
	    }
	    public void setProductLastUpdated(Date lastUpdated) {
	    	this.lastUpdated = lastUpdated;
	    }
	    
	     public int getProductId() {
	    	return id;
	    }
	     public String getProdcutSku() {
	    	return sku;
	    }
	     public String getProductName() {
	    	return name;
	    }
	     public String getProductDescription() {
	    	return description;
	    }
	     public String getProductImageUrl() {
	    	return imageUrl;
	    }
	     public boolean getProductActive() {
	    	return active;
	    }
	     public Date getProductdateCreated() {
	    	return dateCreated;
	    }
	     public Date getProductLastUpdated() {
	    	return lastUpdated;
	    }
	   
	    @Override
	    public String toString() {
	        return "Product{" +
	                "id=" + id +
	                ", sku='" + sku + '\'' +
	                ", name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                ", price=" + price +
	                ", imageUrl='" + imageUrl + '\'' +
	                ", active=" + active +
	                ", dateCreated=" + dateCreated +
	                ", lastUpdated=" + lastUpdated +
	                '}';
	    }
}
