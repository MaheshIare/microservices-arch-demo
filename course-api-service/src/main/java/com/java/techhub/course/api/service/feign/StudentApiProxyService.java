/**
 * 
 */
package com.java.techhub.course.api.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.techhub.course.api.model.Student;

/**
 * @author mahes
 *
 */
@FeignClient(name = "student-api-service")
public interface StudentApiProxyService {

	@GetMapping("/api/v1/student/course/{courseCode}")
	public List<Student> getStudentsByCourseCode(@PathVariable("courseCode") String courseCode);
}
