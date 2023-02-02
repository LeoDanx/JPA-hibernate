package com.angelehlJPA.JPAandHibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelehlJPA.JPAandHibernate.course.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);	
	List<Course> findByName(String course);
	

}
