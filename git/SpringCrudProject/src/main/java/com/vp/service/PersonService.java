package com.vp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.dao.PersonDao;
import com.vp.model.Person;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	PersonDao personDao;
	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}
	
	public void saveOrUpdate(Person person) {
		personDao.saveOrUpdate(person);
	}
}
