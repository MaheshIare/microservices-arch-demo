/**
 * 
 */
package com.java.techhub.student.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.techhub.student.api.model.Student;
import com.java.techhub.student.api.repository.StudentJpaRepository;

/**
 * @author mahes
 *
 */
@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	private StudentJpaRepository studentJpaRepository;

	@Override
	public Student getStudent(Integer studentId) {
		Optional<Student> optional = studentJpaRepository.findById(studentId);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public List<Student> getStudents() {
		return studentJpaRepository.findAll();
	}

	@Override
	public List<Student> getStudentsByCourseCode(String courseCode) {
		return studentJpaRepository.findByCourseCode(courseCode);
	}

}
