package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.exception.CarNotFoundException;
import com.example.model.Car;
import com.example.repository.CarRepository;
import com.example.service.CarService;


public class CarServiceImpl implements CarService{
	@Autowired
	CarRepository repo;
	
	@Override
	//Saving Car details by jpa repository save()
	public Car saveCar(Car car) {
		return repo.save(car) ;
	}

	@Override
	//fetching all Car details by jpa repository findAll()
	public List<Car> getAllCar() {
		return repo.findAll();
	}

	@Override
	//fetching Car details by jpa repository
	public Car getCarById(int id) {
	//find by id , if not present then throw custom exception
		return repo.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found in table"));
	}

	@Override
	public Car updateCarById(Car car, int id) {
		//find by id , if not present then throw custom exception
		Car exitcar = repo.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found in table"));
		//set new value
		exitcar.setcName(car.getcName());
		exitcar.setCarNumber(car.getCarNumber());
		repo.save(exitcar);
		return null ;
	}

	@Override
	//fetching car details using jpa repository findById and removing it using deleteById
	public void deleteCarById(int id) {
	
		repo.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found in table"));
		repo.deleteById(id);
		
	}
}
