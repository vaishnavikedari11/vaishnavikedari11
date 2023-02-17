package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Car;

public interface CarRepository extends JpaRepository <Car,Integer> {

}
