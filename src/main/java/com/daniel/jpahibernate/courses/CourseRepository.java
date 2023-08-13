package com.daniel.jpahibernate.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_QUERY = "insert into course (id,name,author) values (?, ?, ?);";
	
	private static final String SELECT_QUERY = "SELECT * FROM course where id=?;";
	
	public void insertCourse(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public Course selectCourse(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
		//jdbcTemplate.query(SELECT_QUERY, id);
	}
}
