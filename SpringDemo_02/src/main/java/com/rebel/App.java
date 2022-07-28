package com.rebel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rebel.model.Person;
import com.rebel.service.PersonService;
import com.rebel.service.PersonServiceFactory;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person(101, "Kishor", "Kishorgn@gmail.com");
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		PersonServiceFactory personServiceFactory = ctxt.getBean(PersonServiceFactory.class);
		
		PersonService personService = personServiceFactory.getPersonService();
		personService.save(p1);

	}
}
