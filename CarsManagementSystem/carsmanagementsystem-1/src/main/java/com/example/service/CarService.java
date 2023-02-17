package com.example.service;

import java.util.List;

import com.example.model.Car;

public interface CarService {
	//inserting Car details in table
		Car saveCar(Car car);
		
		//fetching all Car details from table
		List<Car>getAllCar();
		
		//fetching Car details from table
		Car getCarById(int id);
		
		//modifying Car details from table based on Car id
		Car updateCarById(Car car, int id);
		
		//remove Car details from table based on Car id
		void deleteCarById(int id);

}
