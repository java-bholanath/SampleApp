package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.Student;
import com.student.demo.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getAllstudents")
	public List<Student> getStudents() {	
		return studentService.getAllStudent();
	}
	
	@GetMapping("/getStudentById")
	public Student getStudentById(@RequestParam Integer id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/createStudent")
	public Student createStudent( @RequestBody Student student) {
		return studentService.createStudent(student);		
	}
	
	@PutMapping("updateStudent/{id}")
	public Student updateStudent(@RequestBody Student student , @PathVariable Integer id) {
		return studentService.updateStudent(student,id);
	}
}
