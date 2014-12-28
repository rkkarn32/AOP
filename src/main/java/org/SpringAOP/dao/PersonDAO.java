package org.SpringAOP.dao;

import org.SpringAOP.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	public void create(Person person){
		System.out.println("You have created a object with name: "+person.getName());
	}
}
