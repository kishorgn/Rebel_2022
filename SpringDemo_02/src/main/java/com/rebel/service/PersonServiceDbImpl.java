package com.rebel.service;

import com.rebel.model.Person;

public class PersonServiceDbImpl implements PersonService {

	public void save(Person person) {
		
		System.out.println("Saving the person into db is : "+person);

	}

	public void read(int id) {
		
		System.out.println("Reading a person from DB with id : "+id);

	}

}
