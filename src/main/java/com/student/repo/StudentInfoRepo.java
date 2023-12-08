package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
@Repository
public interface StudentInfoRepo extends JpaRepository<Student, Integer>{

}
