package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import com.UniversityCourseSelection.entities.Course;
import com.UniversityCourseSelection.exceptions.CourseAlreadyExists;
import com.UniversityCourseSelection.exceptions.CourseIdNotExist;
import com.UniversityCourseSelection.exceptions.CourseNameNotExist;


public interface CourseService {

	Course saveCourse(Course cs) throws CourseAlreadyExists;

	List<Course> getAllCourse();

	Optional<Course> getCourseById(Long id) throws CourseIdNotExist;

	Course updateCourse(Course crs) throws CourseIdNotExist;

	void deleteCourse(Long id) throws CourseIdNotExist;

    Optional<Course> CourseByName(String crsName) throws CourseNameNotExist;
}
