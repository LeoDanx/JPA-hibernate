package com.angelehlJPA.JPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.angelehlJPA.JPAandHibernate.course.Course;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Se ejecuta al inicio del programa
		repository.insert(new Course(1,"Learn Aws","angelehl"));
		repository.insert(new Course(2,"Azure","angelehl"));
		repository.insert(new Course(3,"DevOps","angelehl"));
		
		repository.deleteBy(1);
	}

}
