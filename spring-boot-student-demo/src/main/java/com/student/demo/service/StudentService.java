package com.student.demo.service;

import java.util.List;

import com.student.demo.model.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student createStudent(Student student);

	Student updateStudent(Student student, Integer id);
	

}
