/**
 * 
 */
package com.java.techhub.student.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techhub.student.api.model.Student;

/**
 * @author mahes
 *
 */
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

	List<Student> findByCourseCode(String courseCode);
}
