package com.rebel.service;

import com.rebel.model.Person;

public class PersonServiceFsImpl implements PersonService {

	public void save(Person person) {
		System.out.println("Saving the person into File System is "+person);
		
	}

	public void read(int id) {
		System.out.println("Reading a person from File system with id : "+id);
		
	}

}
