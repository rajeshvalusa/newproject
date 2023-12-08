package com.student.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.dto.error.ErrorResponse;
import com.student.exception.UserInputException;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class StudentExceptionHandler {
	@ExceptionHandler(UserInputException.class)
    public ResponseEntity<ErrorResponse> studentException(UserInputException exception){
    	log.error("Error due to db",exception.getMessage());
    	log.error("Original error",exception.getCause().getMessage());
    	ErrorResponse response=new ErrorResponse(101,"problem due to DB",exception.getMessage(),exception.getCause());
    	return new ResponseEntity<ErrorResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
