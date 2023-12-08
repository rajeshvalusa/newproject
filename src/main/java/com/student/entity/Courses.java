package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Entity
public class Courses {
	@Id
	@GeneratedValue
     private Integer cId;
	
     private String cName;
	
     private Integer cFee;
	 @ManyToOne
	 @JoinColumn(name="fkpid")
	 private Student student;
}
