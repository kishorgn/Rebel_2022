package com.rebel.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rebel.beans.Person;

public class App_01 {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		
		Person p1 = (Person)ctxt.getBean("p1");
		System.out.println("Name : "+p1.getName());
		System.out.println("Email : "+p1.getEmail());
		System.out.println("City of address : "+p1.getAddress().getCity());
		
		

	}

}
