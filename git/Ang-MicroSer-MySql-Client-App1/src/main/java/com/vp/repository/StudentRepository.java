package com.vp.repository;

import org.springframework.data.repository.CrudRepository;

import com.vp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
