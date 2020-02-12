package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vp.dao.StudentDao;
import com.vp.model.Student;

@RestController
public class HomeController {

	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/homedata")
	public ResponseEntity<?> getHomeData() {
		
		return new ResponseEntity<Student>(new Student(11,"Giri", "Add1111"), HttpStatus.OK);
			
		}
	
	@GetMapping("/getAllStudent")
	public List<Student> getStudent(){
		
		return dao.getStudent();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<?> getStudent(@PathVariable("id") int id) {
		return dao.getStudent(id);
	}
	
	
	@PostMapping("/student")
	public ResponseEntity<?> saveStudent(@RequestBody Student student) {
		return dao.insertStudent(student);
	}
	
	
	@DeleteMapping("student/{id}")
	public int deleteStudent(@PathVariable("id") int id) {
		return dao.deleteStudent(id);
	}
	
	
	
	
	
}
