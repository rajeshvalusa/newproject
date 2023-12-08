package com.student.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.exception.UserInputException;
import com.student.service.StudentInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
	@Autowired
   private StudentInfoService studentService;
   @PostMapping("/save")
   public ResponseEntity<Student> saveStudent(@RequestBody  Student studentDTO) 
   throws UserInputException{	
	   log.trace("Entered into save student");
	   if(studentDTO!=null) 
		   log.debug(studentDTO.toString());
		   //studentService.saveStudent(studentDTO);
		   log.trace("Exited from save patient");
		   return ResponseEntity.ok(studentDTO);
   }
}
