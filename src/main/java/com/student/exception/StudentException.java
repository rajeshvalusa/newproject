package com.student.exception;

public class StudentException extends Exception {
   public StudentException() {
	   
   }
   public StudentException(String message) {
	   super(message);
   }
   public StudentException(String message,Throwable throwable) {
	   super(message,throwable);
   }
}
