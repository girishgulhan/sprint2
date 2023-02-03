package com.UniversityCourseSelection.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.UniversityCourseSelection.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
	public Optional<Course> findByCourseName(@Param("name") String courseName);
}
