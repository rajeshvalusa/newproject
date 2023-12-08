package com.student.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
public class StudentDTO {
	
    private Integer sId;
	
    private String sName;
	
    private Integer sAge;
	
    private Long sPhone;
    
   // private List<CoursesDTO> sCourses;
    
}
