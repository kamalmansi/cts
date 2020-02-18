package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vp.model.Person;
import com.vp.service.PersonService;



@Controller
public class PersonController{

	@Autowired
	PersonService personService;
	
	@RequestMapping("/home")
	public String homeFirst() {
		return "Home";
	}
	
	@GetMapping("/listPersons")
	public ModelAndView getPerson() {
		 List list = personService.getAllPerson();
		 System.out.println(list);
		 ModelAndView modelAndView = new ModelAndView("stdList","list",list);
		 return modelAndView;
	 }
	
	@RequestMapping("/stdForm")
	 public String savePerson(Model model) {
		 
		 model.addAttribute("person", new Person());
		 return "stdForm";
	 }
	 
	 @PostMapping("/savePerson")
	 public String savePerson(@ModelAttribute("person") Person person) {
		 personService.saveOrUpdate(person);
		 return "redirect:/listPersons";
	 }
	
	
	
	
	
}
