package com.student.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.model.Student;
import com.student.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {		
		return studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		Optional<Student> std = studentRepository.findById(id);
		if (std.isPresent()) {
			std.get().setEmail(student.getEmail());
			std.get().setFirst_name(student.getFirst_name());
			std.get().setLast_name(student.getLast_name());
		}
		return studentRepository.save(std.get());

	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> std = studentRepository.findById(id);
		
		return std.get();
	}
	 


}
