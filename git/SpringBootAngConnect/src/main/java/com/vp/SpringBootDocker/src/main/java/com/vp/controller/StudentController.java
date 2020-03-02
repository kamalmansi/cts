package com.vp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.Student;
import com.vp.service.StudentService;

@RestController

public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/student")
	public List<Student> listAllStudents(){ 
		 
   	 return (List<Student>) studentService.getAllStudent(); 
    }
	
	
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	
	
	
	
	
	
}