/**
 * 
 */
package com.java.techhub.student.api.service.impl;

import java.util.List;

import com.java.techhub.student.api.model.Student;

/**
 * @author mahes
 *
 */
public interface StudentService {

	Student getStudent(Integer studentId);
	
	List<Student> getStudents();
	
	List<Student> getStudentsByCourseCode(String courseCode);
}
