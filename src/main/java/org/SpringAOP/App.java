package org.SpringAOP;

import org.SpringAOP.model.Person;
import org.SpringAOP.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        PersonService service = context.getBean("personService", PersonService.class);
        Person p = new Person();
        p.setName("Ramesh Karan");
        service.addPerson(p);
        service.show(4);
    }
}
