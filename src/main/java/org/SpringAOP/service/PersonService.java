package org.SpringAOP.service;

import org.SpringAOP.dao.PersonDAO;
import org.SpringAOP.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	PersonDAO personDao;
	public void addPerson(Person person){
		show(5);
		personDao.create(person);
	}
	public void show(int a){
		System.out.println("We are inside Service");
	}
}
