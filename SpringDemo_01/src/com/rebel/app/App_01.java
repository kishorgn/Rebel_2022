package com.rebel.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rebel.beans.Address;
import com.rebel.beans.Person;

public class App_01 {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		Person p1 = ctxt.getBean(Person.class);
		System.out.println("Name : "+p1.getName());
		System.out.println("Email : "+p1.getEmail());
		
		
		Address address = ctxt.getBean(Address.class);
		System.out.println("city of Address : "+address.getCity());
	}

}
