/**
 * 
 */
package com.java.techhub.course.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.techhub.course.api.model.Course;
import com.java.techhub.course.api.model.Student;
import com.java.techhub.course.api.service.CourseService;

/**
 * @author mahes
 *
 */
@RestController
@RequestMapping("/api/v1/course")
public class CourseApiController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/{courseId}")
	public ResponseEntity<Course> getCourse(@PathVariable("courseId") Integer courseId) {
		return new ResponseEntity<>(courseService.getCourse(courseId), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Course>> getCourses() {
		return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
	}
	
	@GetMapping("/student/{courseCode}")
	public ResponseEntity<List<Student>> getStudentsByCourseCode(@PathVariable("courseCode") String courseCode){
		return new ResponseEntity<>(courseService.getStudentsByCourseCode(courseCode), HttpStatus.OK);
	}
	
}
