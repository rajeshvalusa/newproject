package com.student.dto;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.student.entity.Student;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class CoursesDTO {
     private Integer cId;
	
     private String cName;
	
     private Integer cFee;
	 
	 
}
