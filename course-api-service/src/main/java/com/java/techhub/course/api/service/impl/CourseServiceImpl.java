/**
 * 
 */
package com.java.techhub.course.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.techhub.course.api.model.Course;
import com.java.techhub.course.api.model.Student;
import com.java.techhub.course.api.repository.CourseJpaRepository;
import com.java.techhub.course.api.service.CourseService;
import com.java.techhub.course.api.service.feign.StudentApiProxyService;

/**
 * @author mahes
 *
 */
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseJpaRepository courseJpaRepository;
	
	@Autowired
	private StudentApiProxyService studentApiProxyService;

	@Override
	public Course getCourse(Integer courseId) {
		Optional<Course> optional = courseJpaRepository.findById(courseId);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseJpaRepository.findAll();
	}

	@Override
	public List<Student> getStudentsByCourseCode(String courseCode) {
		return studentApiProxyService.getStudentsByCourseCode(courseCode);
	}

}
