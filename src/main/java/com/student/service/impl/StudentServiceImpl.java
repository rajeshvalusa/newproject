package com.student.service.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.exception.StudentException;
import com.student.exception.UserInputException;
import com.student.repo.StudentInfoRepo;
import com.student.service.StudentInfoService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class StudentServiceImpl implements StudentInfoService {
	@Autowired
	private StudentInfoRepo studentRepo;
	@Autowired
    private ModelMapper modelMapper;
	@Override
	public void saveStudent(StudentDTO studentDTO) throws UserInputException{
		 Student student=modelMapper.map(studentDTO, Student.class);
		 log.trace("Entered into save student");
		 if(studentDTO!=null)
			 log.debug(studentDTO.toString());
			 try {
				this.studentRepo.save(student); 
			 }catch(Exception exception) {
				log.error("SQL Error",exception.getMessage());
				throw new UserInputException("problem due to database",exception);
			 }
		log.trace("Exited from student");
	}

}