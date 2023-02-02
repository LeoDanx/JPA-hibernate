package com.angelehlJPA.JPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.angelehlJPA.JPAandHibernate.course.springdatajpa.SpringDataJpaRepository;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private SpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Se ejecuta al inicio del programa
		/*repository.insert(new Course(1,"Learn Aws","angelehl"));
		repository.insert(new Course(2,"Azure","angelehl"));
		repository.insert(new Course(3,"DevOps","angelehl"));*/
		
		repository.save(new Course(1,"Learn Aws","angelehl"));
		repository.save(new Course(2,"Azure","angelehl"));
		repository.save(new Course(3,"DevOps","angelehl"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("angelehl"));
		System.out.println(repository.findByName("angelehl"));
		System.out.println(repository.findByName("Azure"));
	}

}
