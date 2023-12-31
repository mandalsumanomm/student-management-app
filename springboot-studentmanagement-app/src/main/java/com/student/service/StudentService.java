 package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service 
public class StudentService {
 
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public Optional<Student> getStudentById(Long id) {
		return studentRepository.findById(id);
	}
	
	public Student saveStudents (Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
}
