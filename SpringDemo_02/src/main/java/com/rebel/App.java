package com.rebel;

import com.rebel.model.Person;
import com.rebel.service.PersonService;
import com.rebel.service.PersonServiceDbImpl;
import com.rebel.service.PersonServiceFactory;
import com.rebel.service.PersonServiceFsImpl;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person(101, "Kishor", "Kishorgn@gmail.com");
        PersonService personService = PersonServiceFactory.getPersonService();
        personService.save(p1);
    }
}
