package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.Student;
import com.student.demo.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getAllstudent")
	public List<Student> getStudents() {		
		return studentService.getAllStudent();
		
	}
	@PostMapping("/createStudent")
	public Student createStudent( @PathVariable Student student) {
		
		return studentService.createStudent(student);		
	}
	
	@PutMapping("updateStudent/{id}")
	public Student updateStudent(@PathVariable Student student , @PathVariable Integer id  ) {
		
		return studentService.updateStudent(student,id);
	}
}
