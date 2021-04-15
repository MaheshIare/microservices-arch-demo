/**
 * 
 */
package com.java.techhub.course.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.techhub.course.api.model.Course;

/**
 * @author mahes
 *
 */
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {

}
