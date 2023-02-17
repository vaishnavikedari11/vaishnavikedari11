package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(CarNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleCarNotFoundException(CarNotFoundException ex, WebRequest request){
		ErrorMessage  e =  new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
	}
}
