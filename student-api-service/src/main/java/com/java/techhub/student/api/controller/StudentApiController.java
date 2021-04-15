/**
 * 
 */
package com.java.techhub.student.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.techhub.student.api.model.Student;
import com.java.techhub.student.api.service.impl.StudentService;

/**
 * @author mahes
 *
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentApiController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable("studentId") Integer studentId) {
		return new ResponseEntity<Student>(studentService.getStudent(studentId), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getStudents() {
		return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/course/{courseCode}")
	public ResponseEntity<List<Student>> getStudentByCourseCode(@PathVariable("courseCode") String courseCode) {
		return new ResponseEntity<>(studentService.getStudentsByCourseCode(courseCode), HttpStatus.OK);
	}
	
}
