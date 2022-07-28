package com.rebel.service;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceFactory {
	
	PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public void finalize() {
		System.out.println("Person Service Factory destroyed");
	}

}
