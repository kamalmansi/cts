package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.Student;
import com.vp.repository.StudentRepository;

@Transactional
@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		return (List<Student>) studentRepository.findAll();
	}
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	
}
