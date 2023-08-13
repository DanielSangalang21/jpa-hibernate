package com.daniel.jpahibernate.courses;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Transactional
@Component
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insertCourse(Course course) {
		entityManager.merge(course);
	}
}
