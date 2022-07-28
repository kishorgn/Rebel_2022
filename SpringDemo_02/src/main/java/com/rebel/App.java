package com.rebel;

import com.rebel.model.Person;
import com.rebel.service.PersonService;
import com.rebel.service.PersonServiceDbImpl;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person(101, "Kishor", "Kishorgn@gmail.com");
        PersonService personService = new PersonServiceDbImpl();
        personService.save(p1);
    }
}
