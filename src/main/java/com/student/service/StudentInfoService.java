package com.student.service;

import com.student.dto.StudentDTO;
import com.student.exception.StudentException;
import com.student.exception.UserInputException;

public interface StudentInfoService {
     public void saveStudent(StudentDTO studentDTO)throws UserInputException;
}
