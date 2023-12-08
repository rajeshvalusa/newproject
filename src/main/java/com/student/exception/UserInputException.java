package com.student.exception;

public class UserInputException extends Exception{
  public UserInputException() {
	  
  }
  public UserInputException(String message) {
	  super(message);
   }
  public UserInputException(String message,Throwable throwable) {
	  super(message,throwable);
  }
}
