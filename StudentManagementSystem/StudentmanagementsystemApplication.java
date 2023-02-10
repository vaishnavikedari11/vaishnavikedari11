package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@SpringBootApplication
public class StudentmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
		
		StudentDAO studentDao = new StudentDAO();

        // insert values
        Student student = new Student("Amit", "Varma", "amit45@gmail.com");
        Student student1 = new Student("Pawan", "Patel", "patelpawan45@gmail.com");
        Student student2 = new Student("Shubham", "Gautam", "ShubhamG45@gmail.com");

        //save values
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);


        studentDao.getStudent(1);
        studentDao.loadStudent(2);
        studentDao.getStudentById(3);
	}

}
