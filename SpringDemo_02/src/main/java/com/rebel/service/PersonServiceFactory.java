package com.rebel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceFactory {
	
	PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public void finalize() {
		System.out.println("Person Service Factory destroyed");
	}

}
