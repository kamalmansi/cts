package com.vp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.Person;

@Repository
@Transactional
public class PersonDao {

	
	@Autowired
	SessionFactory sessionFactory;
	/*List <Person> list = null;
	
	public List <Person> getPerson(){
		
		list = new ArrayList<Person>();
		list.add(new Person (1, "nany", 22));
		list.add(new Person (1, "nancy", 22));
		list.add(new Person (1, "namy", 22));
		list.add(new Person (1, "nanny", 22));
		
		return list;
	}
	*/
	
	
	
	
	public List<Person> getAllPerson() {
    	
   	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Person.class);
   	 return criteria.list();
    } 
	
	public void saveOrUpdate(Person person) {
 		System.out.println("DATA::: "+person);
 		sessionFactory.getCurrentSession().saveOrUpdate(person);
 		System.out.println("Person save update Done !!!");
 	}
	
	
	
	
}
