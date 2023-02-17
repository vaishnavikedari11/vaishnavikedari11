package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cardetails")
public class Car {
	@Id
	private int id;
	
	@Column(length = 30 , nullable = false)
	@NotBlank(message="Please Enter Your CarName!!!")
	private String cName;

	@Column(length = 10 , nullable = false, unique = true)
	private long carNumber;
	
	@Column(length = 10 , nullable = false, unique = true)
	private long carPrice;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	

	public long getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(long carNumber) {
		this.carNumber = carNumber;
	}
	
	public long getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(long carNumber) {
		this.carPrice = carPrice;
	}
}
