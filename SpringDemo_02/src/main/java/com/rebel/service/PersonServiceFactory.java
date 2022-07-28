package com.rebel.service;

public class PersonServiceFactory {
	private PersonServiceFactory() {
		
	}
	
	static PersonService personService = null;
	
	public static PersonService getPersonService() {
		if(personService == null) {
			personService = new PersonServiceFsImpl();
			return personService;
		}
		else {
			return personService;
		}
	}

}
