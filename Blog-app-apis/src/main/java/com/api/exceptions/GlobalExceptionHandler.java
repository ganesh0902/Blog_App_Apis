package com.api.exceptions;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.api.exceptions.ResourceNotFoundException;
import com.api.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException exception)
	{ 	
		String message = exception.getMessage();				
		ApiResponse apiResponse = new ApiResponse(message, false);		
		return new  ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
}
