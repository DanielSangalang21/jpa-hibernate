package com.daniel.jpahibernate.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CourseJpaRepository cr;
	
	@Override
	public void run(String... args) throws Exception {
		//CourseRepository cr = new CourseRepository();
		Course course = new Course(1,"Learasdsdan AWS sdad","daniel dsda");
		cr.insertCourse(course);
		
		//System.out.println(cr.insertCourse(1));
	}

}
