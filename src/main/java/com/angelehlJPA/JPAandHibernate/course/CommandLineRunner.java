package com.angelehlJPA.JPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.angelehlJPA.JPAandHibernate.course.jdbc.CourseJdbcRepository;
import com.angelehlJPA.JPAandHibernate.course.jpa.CourseJpaRepository;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Se ejecuta al inicio del programa
		repository.insert(new Course(1,"Learn Aws","angelehl"));
		repository.insert(new Course(2,"Azure","angelehl"));
		repository.insert(new Course(3,"DevOps","angelehl"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
