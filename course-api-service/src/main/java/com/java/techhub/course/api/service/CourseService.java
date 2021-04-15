/**
 * 
 */
package com.java.techhub.course.api.service;

import java.util.List;

import com.java.techhub.course.api.model.Course;
import com.java.techhub.course.api.model.Student;

/**
 * @author mahes
 *
 */
public interface CourseService {
	
	Course getCourse(Integer courseId);
	
	List<Course> getAllCourses();
	
	List<Student> getStudentsByCourseCode(String courseCode);
}
