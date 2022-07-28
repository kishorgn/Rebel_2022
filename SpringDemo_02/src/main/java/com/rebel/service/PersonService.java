package com.rebel.service;

import com.rebel.model.Person;

public interface PersonService {
	void save(Person person);
	void read(int id);
}
