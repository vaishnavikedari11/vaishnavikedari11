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

import com.example.model.Car;
import com.example.service.CarService;


public class CarController {
	@Autowired
	   private CarService us;
	   //saving Car details using rest api post mapping
	   @PostMapping("/save")
	   public ResponseEntity<Car> saveCar(@RequestBody Car car){
		   return new ResponseEntity<Car>(us.saveCar(car),HttpStatus.CREATED);  
	   }
	   // get Car details using rest api get Mapping
	   @GetMapping("/getcar")
	   public List<Car> getAllCar(){
		   return us.getAllCar();
	   }
	   
	   // get Car details from table using rest api GET mapping with id attribute
	   @GetMapping("/getcarbyid/{id}")
	   public ResponseEntity<Car> getCarById(@PathVariable("id")int id){
		   return new ResponseEntity<Car>(us.getCarById(id),HttpStatus.OK);
		  
	   }
	   
	   //updating Car details from table using rest api PUT mapping with id attribute
	   @PutMapping("/updatebyid/{id}")
	   public ResponseEntity<Car> updateCarById(@PathVariable("id") int id, @RequestBody Car car){
		   return new ResponseEntity<Car> (us.updateCarById(car,id),HttpStatus.OK);
	   }
	   
	   
	   //delete Car details from table using rest api delete mapping using id attribute
	   @DeleteMapping("/deletecar/{id}")
	   public ResponseEntity<String> deleteCarById(@PathVariable("id") int id){
		   us.deleteCarById(id);
		   return new ResponseEntity<String>("Car deleted Successfully",HttpStatus.OK);
	   }
}
